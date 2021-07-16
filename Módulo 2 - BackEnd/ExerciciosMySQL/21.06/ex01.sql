 create database db_generation_game_online;
 
 use db_generation_game_online;
 
 create table tb_classe(
	id_classe int auto_increment not null,
    classe varchar(20),
    especie varchar(20),
    primary key(id_classe)
 );
 
 create table tb_personagem(
	id_func int auto_increment not null,
    nome varchar(20),
    nickname varchar (20),
    ataque int not null,
	defesa int not null,
    fk_classe int,
    primary key (id_func),
    foreign key (fk_classe) references tb_classe(id_classe)
 );

 insert into tb_classe(classe, especie) values ("Mago","Humano"),
 ("Paladino","Anão"),
 ("Paladino","Orc"),
 ("Mago","Elfo"),
 ("Bardo","Humano");
 
 insert into tb_personagem(nome, nickname,ataque, defesa, fk_classe) values
 ("Ana Flavia", "anaflobis",1500,2000,1),
 ("Emanuela","manu",3000,5000,2),
 ("Isabella", "isa",2800,4500,3),
 ("Gabriel","fwete",1300,3000,4),
 ("Beatriz","bia",2100,3000,5),
 ("Matheus","matt",1000, 1400,1),
 ("Lucas","luki",5000, 7000, 3),
 ("Camile","pink",1000,2500,5);
 
 select * from tb_personagem where ataque > 2000;
 select * from tb_personagem where (defesa > 1000) and (defesa<2000);
 select * from tb_personagem where nome like 'C%';
 
 select * from tb_personagem inner join tb_classe on tb_classe.id_classe = tb_personagem.fk_classe;
 
 select * from tb_personagem inner join tb_classe on tb_classe.id_classe = tb_personagem.fk_classe where classe = "Paladino"; 
 
 

