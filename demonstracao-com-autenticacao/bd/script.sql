CREATE TABLE produto
( id number(10) NOT NULL,
  nome varchar2(50) NOT NULL,
  imagem varchar2(150) NOT NULL,
  preco NUMBER(19,2) NOT NULL
);

CREATE SEQUENCE sequence_produto START WITH 1 INCREMENT BY 1 CACHE 20 NOCYCLE NOORDER;

CREATE TABLE usuario
( id number(10) NOT NULL PRIMARY KEY,
  email varchar2(50) NOT NULL,
  senha varchar2(150) NOT NULL
  );

CREATE SEQUENCE sequence_usuario START WITH 1 INCREMENT BY 1 CACHE 20 NOCYCLE NOORDER;

CREATE TABLE administrador (
    id   NUMBER(19) NOT NULL PRIMARY KEY,
    FOREIGN KEY ( id )
        REFERENCES usuario ( id )
);

CREATE TABLE cliente (
    id   NUMBER(19) NOT NULL PRIMARY KEY,
    FOREIGN KEY ( id )
        REFERENCES usuario ( id )
);

CREATE TABLE vendedor (
    id   NUMBER(19) NOT NULL PRIMARY KEY,
    FOREIGN KEY ( id )
        REFERENCES usuario ( id )
);
