package com.seguranca.demonstracao.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum Perfil {

    ADMINISTRADOR("PERFIL_ADMINISTRADOR"),
    VENDEDOR("PERFIL_VENDEDOR"),
    CLIENTE("PERFIL_CLIENTE");

    private final String role;

}
