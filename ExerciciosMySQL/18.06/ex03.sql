create database escola;

use escola;

create table estudantes(
	id int auto_increment,
    nome varchar(20) not null,
    idade int,
    turma varchar(20),
    nota decimal(10,1),
    primary key(id)
);

insert into estudantes (nome, idade, turma, nota) values ("Nicolas", 14, "9 ANO",8.0);
insert into estudantes (nome, idade, turma, nota) values ("Emanuela", 14, "9 ANO",10.0);
insert into estudantes (nome, idade, turma, nota) values ("Mariana", 13, "8 ANO",6.0);
insert into estudantes (nome, idade, turma, nota) values ("Gabriel", 13, "8 ANO",5.5);
insert into estudantes (nome, idade, turma, nota) values ("Lucas", 12, "7 ANO",9.7);
insert into estudantes (nome, idade, turma, nota) values ("Andreia", 12, "7 ANO",6.9);
insert into estudantes (nome, idade, turma, nota) values ("Catharina", 11, "6 ANO",4.2);
insert into estudantes (nome, idade, turma, nota) values ("Leonardo", 11, "6 ANO",7.5);

select * from estudantes;

select * from estudantes where nota > 7.0;
select * from estudantes where nota < 7.0;

update estudantes set nota= 10.0 where id = 5;

select * from estudantes;

