package com.seguranca.demonstracao.service.impl;

import com.seguranca.demonstracao.domain.Cliente;
import com.seguranca.demonstracao.exception.UsuarioJaCadastradoException;
import com.seguranca.demonstracao.repository.ClienteRepository;
import com.seguranca.demonstracao.repository.UsuarioRepository;
import com.seguranca.demonstracao.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void cadastrar(String email, String senha) {
        if (usuarioRepository.findByEmail(email).isPresent()) {
            throw new UsuarioJaCadastradoException();
        }
        Cliente cliente = new Cliente();
        cliente.setEmail(email);
        cliente.setSenha(passwordEncoder.encode(senha));
        clienteRepository.save(cliente);
    }
}
