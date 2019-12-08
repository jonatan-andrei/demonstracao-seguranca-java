package com.seguranca.demonstracao.repository;

import com.seguranca.demonstracao.domain.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepository extends JpaRepository<Vendedor, Long> {
}
