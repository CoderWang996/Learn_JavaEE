/*
	查询数据库中所有的存储过程
	SELECT * FROM mysql.proc WHERE db='数据库名称';
*/
-- 查看db6数据库中所有的存储过程
SELECT * FROM mysql.proc WHERE db='db6';



/*
	删除存储过程
	DROP PROCEDURE [IF EXISTS] 存储过程名称;
*/
DROP PROCEDURE IF EXISTS stu_group;