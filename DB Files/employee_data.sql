CREATE database if not exists `employee`;
USE `employee`;

DROP table if exists `employee`;

create table `emp_data` (`id` int primary key not null auto_increment,
						 `f_name` varchar(45) default null,
                         `l_name` varchar(45) default null);
                         
                         
show databases;

show tables;

insert into `emp_data` values (01, "Tejas", "Chawda");

