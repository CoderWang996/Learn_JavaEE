-- 创建db7数据库
CREATE DATABASE db7;

-- 使用db7数据库
USE db7;

-- 创建账户表account
CREATE TABLE account(
	id INT PRIMARY KEY AUTO_INCREMENT,	-- 账户id
	NAME VARCHAR(20),			-- 姓名
	money DOUBLE				-- 余额
);
-- 添加数据
INSERT INTO account VALUES (NULL,'张三',1000),(NULL,'李四',1000);


-- 创建日志表account_log
CREATE TABLE account_log(
	id INT PRIMARY KEY AUTO_INCREMENT,	-- 日志id
	operation VARCHAR(20),			-- 操作类型 (insert update delete)
	operation_time DATETIME,		-- 操作时间
	operation_id INT,			-- 操作表的id
	operation_params VARCHAR(200)       	-- 操作参数
);