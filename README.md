🎓 Student Management System (Java + JDBC)

A simple console-based application to manage student data using Java, JDBC, and MySQL.
🔧 Technologies Used:

    Java (Core)

    JDBC (Java Database Connectivity)

    MySQL

    Console (CLI)

📌 Features:

    ➕ Add a new student

    📄 View all students

    🖊️ Update student details

    ❌ Delete student by ID

    💾 Persistent data storage using MySQL

🗃️ Database Schema:

CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    email VARCHAR(50),
    course VARCHAR(50)
);
