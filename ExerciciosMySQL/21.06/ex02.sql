create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
	id int auto_increment not null,
    cliente varchar(20),
    atendente varchar(20),
    primary key(id)
);

create table tb_pizza(
	id_pizza int not null auto_increment,
    produto varchar(20),
    sabor varchar(20),
    preco decimal(5,2) not null,
	fk_categoria int not null,
    primary key (id_pizza),
    foreign key (fk_categoria) references tb_categoria(id)
);

insert into tb_categoria(cliente, atendente) values
("Ana Flavia", "Felipe"),
("Emanuela","Felipe"),
("Maíra","Mariana"),
("Gabriel","Mariana"),
("Otávio","Mariana");

insert into tb_pizza(produto, sabor, preco, fk_categoria) values
("Pizza","Calabresa", 39.99, 1),
("Esfiha","Mussarela",9.99,2),
("Pizza","Brócolis", 46.00,3),
("Esfiha","Calabresa",9.99,4),
("Pizza","Frango",45.99, 1),
("Pizza","Calabresa", 39.99, 5),
("Esfiha","Mussarela",9.99, 4),
("Pizza","Brócolis", 46.00, 3);

select * from tb_pizza where preco >45.00;

select * from tb_pizza where preco>29.00 and preco<60.00;

select * from tb_pizza where produto like 'e%';

select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.fk_categoria;

select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.fk_categoria where atendente = "Felipe";