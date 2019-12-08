package com.seguranca.demonstracao.repository;

import com.seguranca.demonstracao.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
