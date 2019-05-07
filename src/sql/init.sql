create database estore;

use estore;

create table users (
  `id` int not null primary key ,
  `username` varchar (60),
  `password` varchar (60),
  `email` varchar (30),
  `role` varchar (100),
  `state` int ,
  `activecode` varchar(100),
  `updatetime` timestamp
);

