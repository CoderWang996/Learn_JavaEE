/*
	if语句
	IF 判断条件1 THEN 执行的sql语句1;
	[ELSEIF 判断条件2 THEN 执行的sql语句2;]
	...
	[ELSE 执行的sql语句n;]
	END IF;
*/

/*
	定义一个int变量，用于存储班级总成绩
	定义一个varchar变量，用于存储分数描述
	根据总成绩判断：
		380分及以上   学习优秀
		320 ~ 380     学习不错
		320以下       学习一般
*/
DELIMITER $

CREATE PROCEDURE pro_test4()
BEGIN
	-- 定义变量
	DECLARE total INT;
	DECLARE info VARCHAR(10);
	-- 查询总成绩，为total赋值
	SELECT SUM(score) INTO total FROM student;
	-- 对总成绩判断
	IF total > 380 THEN
		SET info = '学习优秀';
	ELSEIF total >= 320 AND total <= 380 THEN
		SET info = '学习不错';
	ELSE
		SET info = '学习一般';
	END IF;
	-- 查询总成绩和描述信息
	SELECT total,info;
END$

DELIMITER ;




-- 调用pro_test4存储过程
CALL pro_test4();