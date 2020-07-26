/*
	while循环
	初始化语句;
	WHILE 条件判断语句 DO
		循环体语句;
		条件控制语句;
	END WHILE;
*/
-- 计算1~100之间的偶数和
DELIMITER $

CREATE PROCEDURE pro_test6()
BEGIN
	-- 定义求和变量
	DECLARE result INT DEFAULT 0;
	-- 定义初始化变量
	DECLARE num INT DEFAULT 1;
	-- while循环
	WHILE num <= 100 DO
		IF num % 2 = 0 THEN
			SET result = result + num;
		END IF;
		
		SET num = num + 1;
	END WHILE;
	
	-- 查询求和结果
	SELECT result;
END$

DELIMITER ;


-- 调用pro_test6存储过程
CALL pro_test6();