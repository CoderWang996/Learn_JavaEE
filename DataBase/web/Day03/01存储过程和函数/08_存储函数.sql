/*
	创建存储函数
	CREATE FUNCTION 函数名称([参数 数据类型])
	RETURNS 返回值类型
	BEGIN
		执行的sql语句;
		RETURN 结果;
	END$
*/
-- 定义存储函数，获取学生表中成绩大于95分的学生数量
DELIMITER $

CREATE FUNCTION fun_test1()
RETURNS INT
BEGIN
	-- 定义变量
	DECLARE s_count INT;
	-- 查询成绩大于95分的数量，为s_count赋值
	SELECT COUNT(*) INTO s_count FROM student WHERE score > 95;
	-- 返回统计结果
	RETURN s_count;
END$

DELIMITER ;


/*
	调用函数
	SELECT 函数名称(实际参数);
*/
-- 调用函数
SELECT fun_test1();


/*
	删除函数
	DROP FUNCTION 函数名称;
*/
-- 删除函数
DROP FUNCTION fun_test1;