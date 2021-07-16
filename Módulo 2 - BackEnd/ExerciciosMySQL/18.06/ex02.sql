create database ecommerce;

use ecommerce;

create table produtos(
	id int auto_increment,
    tipo varchar(20) not null,
    preco decimal(10,2),
    marca varchar(20),
    cor varchar(20),
    primary key(id)
);

insert into produtos (tipo, preco, marca, cor) values ("Camisa", 29.99, "Nike","Azul");
insert into produtos (tipo, preco, marca, cor) values ("Camisa", 29.99, "Adidas","Branco");
insert into produtos (tipo, preco, marca, cor) values ("Tenis", 399.99, "Vans","Preto");
insert into produtos (tipo, preco, marca, cor) values ("Tenis", 299.99, "Vans","Preto");
insert into produtos (tipo, preco, marca, cor) values ("Jaqueta", 199.99, "Calvin Klein","Preto");
insert into produtos (tipo, preco, marca, cor) values ("Calça", 99.99, "Calvin Klein","Preto");
insert into produtos (tipo, preco, marca, cor) values ("Moletom", 149.99, "Adidas","Vermelho");
insert into produtos (tipo, preco, marca, cor) values ("Moletom", 129.99, "Nike","Amarelo");

select * from produtos where preco > 500.00;
select * from produtos where preco < 500.00;

update produtos set marca = "Element" where id = 7;

select * from produtos;

