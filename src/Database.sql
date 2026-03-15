//Create Database
CREATE DATABSE librarymanagement;
USE librarymanagement;

//Create Tables

//Admin and User Table
CREATE TABLE login(userName varchar(15) PRIMARY KEY,password varchar(20) NOT NULL);

//Books Table
CREATE TABLE Books
(BookID int PRIMARY KEY,
Title varchar(15) UNIQUE,
Author varchar(15) NOT NULL,
Quantity int NOT NULL);