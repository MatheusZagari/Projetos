insert into cidades (nome, estado_id, area) values ('Campinas', 25, 745)

insert into cidades (nome, estado_id, area) values ('Niteroi', 19, 1000)

insert into cidades (nome, estado_id, area) values ('Caruaru', (select id from estados where sigla = 'PE'), 300)

insert into cidades (nome, estado_id, area) values ('Juazeriro do Norte', (select id from estados where sigla = 'CE'), 250)

select * from estados where id = 25

select * from cidades