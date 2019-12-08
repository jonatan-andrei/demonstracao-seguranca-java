package com.seguranca.demonstracao.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UsuarioJaCadastradoException extends RuntimeException {

    public UsuarioJaCadastradoException() {
        super("Este usuário já está cadastrado. Faça o login para acessar o sistema.");
    }
}
