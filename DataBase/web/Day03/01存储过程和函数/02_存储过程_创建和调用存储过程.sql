/*
	创建存储过程

	-- 修改分隔符为$
	DELIMITER $

	-- 标准语法
	CREATE PROCEDURE 存储过程名称(参数列表)
	BEGIN
		SQL 语句列表;
	END$

	-- 修改分隔符为分号
	DELIMITER ;
*/
-- 创建stu_group()存储过程，封装 分组查询总成绩，并按照总成绩升序排序的功能
DELIMITER $

CREATE PROCEDURE stu_group()
BEGIN
	SELECT gender,SUM(score) getSum FROM student GROUP BY gender ORDER BY getSum ASC;
END$

DELIMITER ;

/*
	调用存储过程
	CALL 存储过程名称(实际参数);
*/
-- 调用stu_group()存储过程
CALL stu_group();