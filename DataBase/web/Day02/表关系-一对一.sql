-- 创建db3数据库
CREATE DATABASE IF NOT EXISTS db3;

-- 使用db3数据库
USE db3;

-- 创建person表
CREATE TABLE person(
     id INT PRIMARY KEY AUTO_INCREMENT,
     nmae VARCHAR(20) NOT NULL
);
-- 添加数据
INSERT INTO person VALUES(NULL,'张三'),(NULL,'李四');
SELECT * FROM person;

-- 创建card表
CREATE TABLE card(
     id INT PRIMARY KEY AUTO_INCREMENT,
     number VARCHAR(20) UNIQUE NOT NULL,
     pid INT UNIQUE,
     CONSTRAINT cp_fk FOREIGN KEY (pid) REFERENCES person(id)
);
SELECT * FROM card;
-- 添加数据
INSERT INTO card VALUES (NULL,'12345',1),(NULL,'56789',2);