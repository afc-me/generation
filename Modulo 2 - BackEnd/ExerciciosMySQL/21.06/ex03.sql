create database db_farmacia_do_bem;
use db_farmacia_do_bem;

create table tb_categorias(
	id int auto_increment not null,
    marca varchar(20),
    generico boolean,
    primary key(id)
);

create table tb_produto(
	id_prod int auto_increment not null,
	produto varchar(20),
    preco decimal(5,2),
    tipo varchar (20),
    fk_id int not null,
    primary key (id_prod),
    foreign key (fk_id) references tb_categorias(id)
);

insert into tb_categorias(marca, generico) values
("Takeda", false),
("Eurofarma",true),
("Ache",true);

insert into tb_produto(produto, preco, tipo, fk_id) values
("Nebacetin", 20.00, "Pomada",1),
("Neosaldina",10.00, "Comprimido",1),
("Dramin", 30.00, "Comrpimido",1),
("Dipirona",15.00, "Comprimido",2),
("Loratidina",30.00,"Comprimido",2),
("Paracetamol",25.99,"Comprimido",2),
("Leucogen", 100.00, "Comprimido",3),
("Amoxicilina",50.00,"Comprimido",3);

select * from tb_produto where preco>50.00;
select * from tb_produto where preco >3 and preco<60.00;

select * from tb_produto where produto like 'N%';

select * from tb_produto inner join tb_categorias on tb_categorias.id = tb_produto.fk_id;

select * from tb_produto inner join tb_categorias on tb_categorias.id = tb_produto.fk_id where generico = true;


