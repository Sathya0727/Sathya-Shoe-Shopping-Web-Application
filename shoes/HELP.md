### 🛒 Sathya Shoe Shopping Web Application

A modern and responsive E-commerce Shoes Store built using Spring Boot, MySQL, Thymeleaf, Bootstrap, and Java.
The project includes user login, product listing, categories, shopping cart, and a clean UI design.

🚀 Features
## 🔐 User Authentication

Login page with animations

MySQL-based user validation

Error message for invalid credentials

Redirects to dashboard after successful login

## 🛍️ E-Commerce Modules

Featured products section

Add to Cart (client-side for demo)

Product categories

Modern UI with hover animations

Full-screen slider banner

## 🏗️ Tech Stack
Layer	Technology
Backend	Spring Boot (MVC, JPA)
Frontend	HTML, CSS, Bootstrap 5, Thymeleaf
Database	MySQL
Build Tool	Maven
IDE	VS Code / IntelliJ / STS

### MYSQL QUERY
CREATE DATABASE login_database;
USE login_database;
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50),
    password VARCHAR(50)
);
INSERT INTO users (username, password) VALUES ('sathyaj', '12345');

select * from users;

## How to run & packages install
mvn clean install
mvn clean install -U
mvn dependency:resolve
mvn spring-boot:run

## 4️⃣ Open in Browser

👉 Login Page

http://localhost:8080/


👉 After login success:

http://localhost:8080/sathya

## ✨ Highlights

Clean UI + professional animations

Fully responsive design

Easy to customize product & category data

Simple backend login logic (no Spring Security)

Perfect for beginners learning Spring MVC + Thymeleaf