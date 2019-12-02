package com.seguranca.demonstracao.service;

import com.seguranca.demonstracao.domain.Produto;

import java.util.List;

public interface ProdutoService {

    List<Produto> listar();

    Produto buscarPorId(Long id);

    void cadastrar(Produto produto);

}
