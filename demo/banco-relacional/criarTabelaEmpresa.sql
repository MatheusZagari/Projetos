create table empresas(
    id int not null auto_increment,
    nome varchar(255) not null,
    cnpj int unsigned not null,
    primary key (id),
    unique key (cnpj)
);

-- cidades_empresas
CREATE TABLE IF NOT EXISTS empresas_unidades (
    empresa_id INT UNSIGNED NOT NULL,
    cidade_id INT UNSIGNED NOT NULL,
    sede TINYINT(1) NOT NULL,
    PRIMARY KEY (empresa_id, cidade_id)
);

