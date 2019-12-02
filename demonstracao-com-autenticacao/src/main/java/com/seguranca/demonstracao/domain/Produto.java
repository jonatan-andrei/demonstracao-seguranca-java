package com.seguranca.demonstracao.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@SequenceGenerator(name = "generator_produto", sequenceName = "sequence_produto", initialValue = 1, allocationSize = 1)
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_produto")
    private Long id;

    private String nome;

    private String imagem;

    private BigDecimal preco;

}
