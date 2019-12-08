package com.seguranca.demonstracao.dto;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class LoginRequest {

    @NotEmpty
    private String email;

    @NotEmpty
    private String senha;

}

