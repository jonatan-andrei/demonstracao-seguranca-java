package com.seguranca.demonstracao.service.impl;

import com.seguranca.demonstracao.domain.Administrador;
import com.seguranca.demonstracao.exception.UsuarioJaCadastradoException;
import com.seguranca.demonstracao.repository.AdministradorRepository;
import com.seguranca.demonstracao.repository.UsuarioRepository;
import com.seguranca.demonstracao.service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdministradorServiceImpl implements AdministradorService {

    @Autowired
    private AdministradorRepository administradorRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void cadastrar(String email, String senha) {
        if (usuarioRepository.findByEmail(email).isPresent()) {
            throw new UsuarioJaCadastradoException();
        }
        Administrador administrador = new Administrador();
        administrador.setEmail(email);
        administrador.setSenha(passwordEncoder.encode(senha));
        administradorRepository.save(administrador);
    }
}
