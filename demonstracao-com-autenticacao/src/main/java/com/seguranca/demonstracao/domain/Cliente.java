package com.seguranca.demonstracao.domain;

import javax.persistence.Entity;

import static com.seguranca.demonstracao.domain.Perfil.CLIENTE;

@Entity
public class Cliente extends Usuario {

    public Perfil getPerfil() {
        return CLIENTE;
    }
}
