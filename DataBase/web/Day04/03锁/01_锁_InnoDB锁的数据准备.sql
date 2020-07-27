-- 创建db10数据库
CREATE DATABASE db10;

-- 使用db10数据库
USE db10;

-- 创建student表
CREATE TABLE student(
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(10),
	age INT,
	score INT
);

-- 添加数据
INSERT INTO student VALUES (NULL,'张三',23,99),(NULL,'李四',24,95),
(NULL,'王五',25,98),(NULL,'赵六',26,97);