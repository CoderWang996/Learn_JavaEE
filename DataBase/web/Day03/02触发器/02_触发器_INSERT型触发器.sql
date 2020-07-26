/*
	创建触发器
	DELIMITER $

	CREATE TRIGGER 触发器名称
	BEFORE|AFTER INSERT|UPDATE|DELETE
	ON 表名
	FOR EACH ROW
	BEGIN
		触发器要执行的功能;
	END$

	DELIMITER ;
*/
-- 创建INSERT型触发器。用于对account表新增数据进行日志的记录
DELIMITER $

CREATE TRIGGER account_insert
AFTER INSERT
ON account
FOR EACH ROW
BEGIN
	INSERT INTO account_log VALUES (NULL,'INSERT',NOW(),new.id,CONCAT('插入后{id=',new.id,',name=',new.name,',money=',new.money,'}'));
END$

DELIMITER ;

-- 向account表添加一条记录
INSERT INTO account VALUES (NULL,'王五',2000);

-- 查询account表
SELECT * FROM account;

-- 查询account_log表
SELECT * FROM account_log;