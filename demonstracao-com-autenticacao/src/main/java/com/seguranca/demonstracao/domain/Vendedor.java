package com.seguranca.demonstracao.domain;

import javax.persistence.Entity;

import static com.seguranca.demonstracao.domain.Perfil.VENDEDOR;

@Entity
public class Vendedor extends Usuario {

    public Perfil getPerfil() {
        return VENDEDOR;
    }
}
