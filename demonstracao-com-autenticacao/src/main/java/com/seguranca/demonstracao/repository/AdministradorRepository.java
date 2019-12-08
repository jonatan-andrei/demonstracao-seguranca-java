package com.seguranca.demonstracao.repository;

import com.seguranca.demonstracao.domain.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministradorRepository extends JpaRepository<Administrador, Long> {
}
