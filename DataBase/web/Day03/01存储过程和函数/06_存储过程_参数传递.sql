/*
	参数传递
	CREATE PROCEDURE 存储过程名称([IN|OUT|INOUT] 参数名 数据类型)
	BEGIN
		SQL 语句列表;
	END$
*/
/*
	输入总成绩变量，代表学生总成绩
	输出分数描述变量，代表学生总成绩的描述信息
	根据总成绩判断：
		380分及以上  学习优秀
		320 ~ 380    学习不错
		320以下      学习一般
*/
DELIMITER $

CREATE PROCEDURE pro_test5(IN total INT,OUT info VARCHAR(10))
BEGIN
	-- 对总成绩判断
	IF total > 380 THEN
		SET info = '学习优秀';
	ELSEIF total >= 320 AND total <= 380 THEN
		SET info = '学习不错';
	ELSE
		SET info = '学习一般';
	END IF;
END$

DELIMITER ;

-- 调用pro_test5存储过程
CALL pro_test5(350,@info);

CALL pro_test5((SELECT SUM(score) FROM student),@info);

SELECT @info;