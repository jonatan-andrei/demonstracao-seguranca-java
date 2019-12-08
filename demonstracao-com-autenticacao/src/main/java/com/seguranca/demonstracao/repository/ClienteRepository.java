package com.seguranca.demonstracao.repository;

import com.seguranca.demonstracao.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
