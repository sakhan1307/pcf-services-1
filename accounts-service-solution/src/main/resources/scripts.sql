/*
SQLyog v4.06 RC1
Host - 5.0.21-community-nt : Database - micro
*********************************************************************
Server version : 5.0.21-community-nt
*/


create database if not exists `micro`;

USE `micro`;

/*Table structure for table `account` */

drop table if exists `account`;

CREATE TABLE `account` (
  `id` int(11) NOT NULL,
  `address` varchar(250) default NULL,
  `authtoken` varchar(100) default NULL,
  `balance` decimal(14,2) NOT NULL,
  `creationdate` datetime default NULL,
  `creditcard` varchar(250) default NULL,
  `email` varchar(250) default NULL,
  `fullname` varchar(250) default NULL,
  `lastlogin` datetime default NULL,
  `logincount` int(11) NOT NULL,
  `logoutcount` int(11) NOT NULL,
  `openbalance` decimal(14,2) NOT NULL,
  `passwd` varchar(250) default NULL,
  `userid` varchar(250) NOT NULL,
  PRIMARY KEY  (`id`),
  UNIQUE KEY `UK_eemtigya6ecjvaugout5us2rn` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `account` */

insert into `account` values (1,'Bangalore','ee5dbc70-f859-418d-8a93-ab7d26e90473','81006.27','2017-04-21 22:19:21','1234123412341234','siva@way2learnonline.com','SivaPrasad','2017-04-22 15:41:40',2,0,'100000.00','siva','siva'),(32768,'Bangalore','ee5dbc70-f859-418d-8a93-ab7d26e90473','81006.27','2017-04-21 22:19:21','1234123412341234','siva@way2learnonline.com','Prasad','2017-04-22 15:41:40',2,0,'100000.00','prasad','prasad');

/*Table structure for table `hibernate_sequences` */

drop table if exists `hibernate_sequences`;

CREATE TABLE `hibernate_sequences` (
  `sequence_name` varchar(255) NOT NULL,
  `sequence_next_hi_value` bigint(20) default NULL,
  PRIMARY KEY  (`sequence_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `hibernate_sequences` */

insert into `hibernate_sequences` values ('account',2),('orders',1);

/*Table structure for table `orders` */

drop table if exists `orders`;

CREATE TABLE `orders` (
  `orderid` int(11) NOT NULL,
  `accountid` varchar(255) NOT NULL,
  `completiondate` datetime default NULL,
  `orderfee` decimal(14,2) default NULL,
  `ordertype` int(11) NOT NULL,
  `price` decimal(14,2) NOT NULL,
  `quantity` int(11) NOT NULL,
  `symbol` varchar(10) NOT NULL,
  PRIMARY KEY  (`orderid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `orders` */

insert into `orders` values (1,'siva','2017-04-21 22:19:59','10.50',0,'91.86',100,'VMW'),(2,'siva','2017-04-21 22:20:20','10.50',0,'65.50',200,'MSFT'),(3,'siva','2017-04-21 22:20:29','10.50',1,'66.48',50,'MSFT');
