-- 创建student表
CREATE TABLE student(
    id INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(10) NOT NULL
);
-- 添加数据
INSERT INTO student VALUES (NULL,'张三'),(NULL,'李四');

-- 创建course表
CREATE TABLE couse(
    id INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(10) UNIQUE NOT NULL
);
ALTER TABLE couse RENAME TO course;
-- 添加数据
INSERT INTO course VALUES (NULL,'语文'),(NULL,'数学');


-- 创建中间表
CREATE TABLE stu_course(
	id INT PRIMARY KEY AUTO_INCREMENT,	-- 主键id
	sid INT,  -- 用于和student表中的id进行外键关联
	cid INT,  -- 用于和course表中的id进行外键关联
	CONSTRAINT sc_fk1 FOREIGN KEY (sid) REFERENCES student(id), -- 添加外键约束
	CONSTRAINT sc_fk2 FOREIGN KEY (cid) REFERENCES course(id)   -- 添加外键约束
);
-- 添加数据
INSERT INTO stu_course VALUES (NULL,1,1),(NULL,1,2),(NULL,2,1),(NULL,2,2);