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

create table products(
  `id` varchar (100) primary key ,
  `name` varchar (40),
  `price` double,
  `category` varchar(40),
  `pnum` int ,
	`imgurl` varchar(100),
	`description` varchar(255)
);

--订单表
create table orders(
   id varchar(100) primary key,
   money double,
   receiverinfo varchar(255),
   paystate int,
   ordertime timestamp,
   user_id int ,
   foreign key(user_id) references users(id)
);

--订单项
create table orderitem(
   order_id varchar(100),
   product_id varchar(100),
   buynum int ,
   primary key(order_id,product_id),
   foreign key(order_id) references orders(id),
   foreign key(product_id) references products(id)
);

create table `category`(
  `code` int(11) default null ,
  `name` varchar(40) default null ,
  `fathercode` int(11) default null,
);

