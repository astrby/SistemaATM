drop database if exists sistema_atm;

create database sistema_atm;

use sistema_atm;

create table clientes (
	cedula_cliente int not null primary key,
    contrasena varchar(10) not null
);

create table cuentas (
    cedula_cliente int not null,
    fondos int,
    
    primary key (cedula_cliente),
    foreign key (cedula_cliente) references clientes (cedula_cliente)
);

create table transacciones (
	id_transaccion int not null auto_increment primary key,
    cedula_cliente int not null,
	tipo_transaccion varchar(20) not null,
    cantidad int not null,
    
    foreign key (cedula_cliente) references cuentas (cedula_cliente)
);
