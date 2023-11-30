create database infox;
use infox;

create table tbusuarios(
iduser int(11) primary key auto_increment,
usuario varchar(50),
fone varchar(15),
login varchar(15),
senha varchar(15),
perfil varchar(20)
);

insert into tbusuarios(usuario, fone, login, senha, perfil) values
('joão da silva','91111-1111','jo','123','admin'),
('maria oliveira','92222-2222','mary','321','user');

desc tbusuarios;

create table tbclientes(
idcli int(11) primary key auto_increment,
nomecli varchar(50),
endcli varchar(100),
fonecli varchar(50),
emailcli varchar(50)
);

desc tbclientes;

create table tbos(
os int (11) primary key auto_increment,
tipo varchar (20) not null,
situacao varchar(50) not null,
data_os timestamp default current_timestamp,
equipamentos varchar (150) not null,
defeitos varchar (150) not null,
servico varchar (150),
tecnico varchar (150),
valor decimal(10,2),
idcli int (11) not null,
foreign key(idcli) references tbclientes(idcli)
);



desc tbos;