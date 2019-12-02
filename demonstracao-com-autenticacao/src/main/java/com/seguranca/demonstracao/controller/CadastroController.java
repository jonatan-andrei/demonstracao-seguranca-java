package com.seguranca.demonstracao.controller;

import com.seguranca.demonstracao.dto.ClienteRequest;
import com.seguranca.demonstracao.dto.LoginResponse;
import com.seguranca.demonstracao.security.LoginService;
import com.seguranca.demonstracao.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private LoginService loginService;

    @PostMapping
    public ResponseEntity<LoginResponse> cadastrar(@RequestBody ClienteRequest request) {
        clienteService.cadastrar(request.getEmail(), request.getSenha());
        String token = loginService.login(request.getEmail(), request.getSenha());
        return ResponseEntity.ok().body(new LoginResponse(token));
    }

}
