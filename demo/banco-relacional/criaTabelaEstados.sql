-- Criando tabela de estado

create table teste (
    id int unsigned not null auto_increment,
    nome varchar(45) not null,
    sigla varchar(2) not null,
    regiao enum('Norte', 'Nordeste', 'Sul', 'Sudeste', 'Centro-Oeste') not null,
    populacao decimal(5, 2) not null,
    PRIMARY KEY (id),
    unique key (nome),
    unique key (sigla)
);