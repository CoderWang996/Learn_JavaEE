-- 创建学生表
CREATE TABLE student(
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(10)
);

-- 添加两条记录
INSERT INTO student VALUES (NULL,'张三'),(NULL,'李四');

-- 查询学生表
SELECT * FROM student;