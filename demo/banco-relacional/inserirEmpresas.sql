insert into empresas (nome, cnpj) values ('Empresa A', 12345678901234), ('Empresa B', 23456789012345), ('Empresa C', 34567890123456);
desc empresas;
desc prefeitos;

alter table empresas modify cnpj varchar(14);

select * from empresas;

insert into empresas_unidades (empresa_id, cidade_id, sede) values (1, 1, 1), (1, 2, 0), (2, 1, 0), (2, 2, 1);