package com.seguranca.demonstracao.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum Perfil {

    ADMINISTRADOR("ROLE_ADMINISTRADOR"),
    VENDEDOR("ROLE_VENDEDOR"),
    CLIENTE("ROLE_CLIENTE");

    private final String role;

}
