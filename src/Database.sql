//Create Database
CREATE DATABSE librarymanagement;
USE librarymanagement;

//Create Tables

//Admin and User Table
CREATE TABLE login(userName varchar(15) PRIMARY KEY,password varchar(20) NOT NULL);
//Insert Values
INSERT INTO login VALUES
("Admin","2006");
("User","0715");

//Books Table
CREATE TABLE Books
(BookID int PRIMARY KEY,
Title varchar(15) UNIQUE,
Author varchar(15) NOT NULL,
Quantity int NOT NULL);
