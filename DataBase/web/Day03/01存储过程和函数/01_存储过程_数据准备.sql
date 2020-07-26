-- 创建db6数据库
CREATE DATABASE db6;

-- 使用db6数据库
USE db6;

-- 创建学生表
CREATE TABLE student(
	id INT PRIMARY KEY AUTO_INCREMENT,	-- 学生id
	NAME VARCHAR(20),			-- 学生姓名
	age INT,				-- 学生年龄
	gender VARCHAR(5),			-- 学生性别
	score INT                               -- 学生成绩
);
-- 添加数据
INSERT INTO student VALUES (NULL,'张三',23,'男',95),(NULL,'李四',24,'男',98),
(NULL,'王五',25,'女',100),(NULL,'赵六',26,'女',90);




-- 按照性别进行分组，查询每组学生的总成绩。按照总成绩的升序排序
SELECT gender,SUM(score) getSum FROM student GROUP BY gender ORDER BY getSum ASC;