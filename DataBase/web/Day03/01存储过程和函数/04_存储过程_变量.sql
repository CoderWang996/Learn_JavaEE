/*
	定义变量
	DECLARE 变量名 数据类型 [DEFAULT 默认值];
*/
-- 定义一个int类型变量，并赋默认值为10
DELIMITER $

CREATE PROCEDURE pro_test1()
BEGIN
	-- 定义变量
	DECLARE num INT DEFAULT 10;
	-- 使用变量
	SELECT num;
END$

DELIMITER ;

-- 调用pro_test1存储过程
CALL pro_test1();



/*
	变量赋值-方式一
	SET 变量名 = 变量值;
*/
-- 定义一个varchar类型变量并赋值
DELIMITER $

CREATE PROCEDURE pro_test2()
BEGIN
	-- 定义变量
	DECLARE NAME VARCHAR(10);
	-- 为变量赋值
	SET NAME = '存储过程';
	-- 使用变量
	SELECT NAME;
END$

DELIMITER ;

-- 调用pro_test2存储过程
CALL pro_test2();




/*
	变量赋值-方式二
	SELECT 列名 INTO 变量名 FROM 表名 [WHERE 条件];
*/
-- 定义两个int变量，用于存储男女同学的总分数
DELIMITER $

CREATE PROCEDURE pro_test3()
BEGIN
	-- 定义两个变量
	DECLARE men,women INT;
	-- 查询男同学的总分数，为men赋值
	SELECT SUM(score) INTO men FROM student WHERE gender='男';
	-- 查询女同学的总分数，为women赋值
	SELECT SUM(score) INTO women FROM student WHERE gender='女';
	-- 使用变量
	SELECT men,women;
END$

DELIMITER ;

-- 调用pro_test3存储过程
CALL pro_test3();