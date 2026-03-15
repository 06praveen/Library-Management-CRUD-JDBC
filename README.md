# 📚 Library Management System (Java + JDBC)

A **console-based Library Management System** built using **Core Java, JDBC, and MySQL**.
This project demonstrates **database connectivity, CRUD operations, and role-based authentication** using Java.

The system allows **administrators to manage books** and **users to interact with the library database**, showcasing practical backend programming concepts.

---

## ✨ Features

🔐 **Role-Based Login**

* Admin login
* User login
* Credential verification using database

📖 **Book Management**

* Add new books
* View all books
* Update book quantity
* Delete books

🗄 **Database Integration**

* MySQL database connectivity
* JDBC PreparedStatement usage
* SQL query handling

⚙ **Core Java Concepts**

* Object-Oriented Programming
* Exception Handling
* Modular code structure

---

## 🛠 Technologies Used

| Technology       | Purpose                 |
| ---------------- | ----------------------- |
| **Java**         | Core application logic  |
| **JDBC**         | Database connectivity   |
| **MySQL**        | Data storage            |
| **Eclipse IDE**  | Development environment |
| **Git & GitHub** | Version control         |

---

## 📂 Project Structure

```
Library-Management-CRUD-JDBC
│
├── src
│   └── myPackage
│       ├── Main.java          → Application entry point
│       ├── DBConnection.java  → Database connection setup
│       ├── LoginCheck.java    → Authentication logic
│       ├── Query.java         → SQL query constants
│       ├── AdminMenu.java     → Admin functionalities
│       ├── UserMenu.java      → User functionalities
│       └── BookDAO.java       → Book CRUD operations
│
├── database.sql               → Database setup script
├── README.md                  → Project documentation
└── .gitignore                 → Git ignored files
```

---

## 🗄 Database Setup

Run the following SQL script in MySQL to create the database and tables.

```sql
CREATE DATABASE librarymanagement;

USE librarymanagement;

CREATE TABLE login(
id INT AUTO_INCREMENT PRIMARY KEY,
username VARCHAR(50) UNIQUE,
password VARCHAR(50),
role VARCHAR(20)
);

INSERT INTO login(username,password,role)
VALUES
('admin','123','Admin'),
('raj','123','User');

CREATE TABLE books(
id INT PRIMARY KEY,
title VARCHAR(100),
author VARCHAR(100),
quantity INT
);
```

---

## 🚀 How to Run the Project

### 1️⃣ Clone the Repository

```
git clone https://github.com/06praveen/Library-Management-CRUD-JDBC.git
```

### 2️⃣ Import the Project

Open the project in **Eclipse IDE** or any Java IDE.

### 3️⃣ Setup the Database

Run the SQL script:

```
database.sql
```

### 4️⃣ Configure Database Credentials

Open:

```
DBConnection.java
```

Update the MySQL credentials if needed.

### 5️⃣ Run the Application

Run:

```
Main.java
```

---

## 🔑 Default Login Credentials

| Role  | Username | Password |
| ----- | -------- | -------- |
| Admin | admin    | 123      |
| User  | raj      | 123      |

---

## 🎯 Learning Outcomes

This project helped practice and understand:

* JDBC database connectivity
* SQL CRUD operations
* ResultSet processing
* PreparedStatement usage
* Role-based authentication
* Basic DAO structure in Java

---

## 🔮 Future Improvements

Possible enhancements for the system:

* 📚 Issue / Return book functionality
* ⏳ Fine calculation system
* 🔍 Book search feature
* 📊 Book availability tracking
* 🌐 Web-based version using **Spring Boot**

---

## 👨‍💻 Author

**Praveen**

GitHub:
https://github.com/06praveen

---

⭐ If you found this project helpful, feel free to **star the repository**.
