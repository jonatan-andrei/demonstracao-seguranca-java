package com.seguranca.demonstracao.domain;

import javax.persistence.Entity;

import static com.seguranca.demonstracao.domain.Perfil.ADMINISTRADOR;

@Entity
public class Administrador extends Usuario {

    public Perfil getPerfil() {
        return ADMINISTRADOR;
    }

}
