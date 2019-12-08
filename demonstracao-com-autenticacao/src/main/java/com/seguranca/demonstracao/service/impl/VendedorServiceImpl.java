package com.seguranca.demonstracao.service.impl;

import com.seguranca.demonstracao.domain.Vendedor;
import com.seguranca.demonstracao.exception.UsuarioJaCadastradoException;
import com.seguranca.demonstracao.repository.UsuarioRepository;
import com.seguranca.demonstracao.repository.VendedorRepository;
import com.seguranca.demonstracao.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class VendedorServiceImpl implements VendedorService {

    @Autowired
    private VendedorRepository vendedorRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void cadastrar(String email, String senha) {
        if (usuarioRepository.findByEmail(email).isPresent()) {
            throw new UsuarioJaCadastradoException();
        }
        Vendedor vendedor = new Vendedor();
        vendedor.setEmail(email);
        vendedor.setSenha(passwordEncoder.encode(senha));
        vendedorRepository.save(vendedor);
    }
}
