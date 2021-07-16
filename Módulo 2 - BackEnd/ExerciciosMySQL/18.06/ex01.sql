create database empresa;

use empresa;

create table funcionarios (
	id int auto_increment,
    nome varchar(20) not null,
    cargo varchar(20) not null,
    setor varchar(20) not null,
    salario decimal(10,2) not null,
    primary key(id)
);

insert into funcionarios(nome, cargo, setor, salario) values ("Isabella","Gerente","Recursos Humanos", 15000.00);
insert into funcionarios(nome, cargo, setor, salario) values ("Ana","Consultor","Recursos Humanos", 5000.00);
insert into funcionarios(nome, cargo, setor, salario) values ("Laura","Consultor","Recursos Humanos", 3000.00);
insert into funcionarios(nome, cargo, setor, salario) values ("Gabriel","Recrutador","Recursos Humanos", 3500.00);
insert into funcionarios(nome, cargo, setor, salario) values ("Mateus","Estagiário","Recursos Humanos", 1500.00);


select * from funcionarios where salario >2000.00;
select * from funcionarios where salario < 2000.00;

update funcionarios set salario = 4000 where id = 3;

select * from funcionarios;
