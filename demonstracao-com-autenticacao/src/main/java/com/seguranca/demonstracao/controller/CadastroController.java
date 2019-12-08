package com.seguranca.demonstracao.controller;

import com.seguranca.demonstracao.dto.CadastroRequest;
import com.seguranca.demonstracao.dto.LoginResponse;
import com.seguranca.demonstracao.security.LoginService;
import com.seguranca.demonstracao.service.AdministradorService;
import com.seguranca.demonstracao.service.ClienteService;
import com.seguranca.demonstracao.service.VendedorService;
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
    private LoginService loginService;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private VendedorService vendedorService;

    @Autowired
    private AdministradorService administradorService;

    @PostMapping
    public ResponseEntity<LoginResponse> cadastrar(@RequestBody CadastroRequest request) {
        clienteService.cadastrar(request.getEmail(), request.getSenha());
        String token = loginService.login(request.getEmail(), request.getSenha());
        return ResponseEntity.ok().body(new LoginResponse(token));
    }

    // Endpoints criados apenas para teste na aplicação

    @PostMapping("/administrador")
    public ResponseEntity<LoginResponse> cadastrarAdministrador(@RequestBody CadastroRequest request) {
        administradorService.cadastrar(request.getEmail(), request.getSenha());
        String token = loginService.login(request.getEmail(), request.getSenha());
        return ResponseEntity.ok().body(new LoginResponse(token));
    }

    @PostMapping("/vendedor")
    public ResponseEntity<LoginResponse> cadastrarVendedor(@RequestBody CadastroRequest request) {
        vendedorService.cadastrar(request.getEmail(), request.getSenha());
        String token = loginService.login(request.getEmail(), request.getSenha());
        return ResponseEntity.ok().body(new LoginResponse(token));
    }

}
