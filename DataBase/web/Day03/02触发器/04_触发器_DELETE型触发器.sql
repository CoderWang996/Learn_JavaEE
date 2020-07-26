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
-- 创建DELETE型触发器。用于对account表删除数据进行日志的记录
DELIMITER $

CREATE TRIGGER account_delete
AFTER DELETE
ON account
FOR EACH ROW
BEGIN
	INSERT INTO account_log VALUES (NULL,'DELETE',NOW(),old.id,CONCAT('删除前{id=',old.id,',name=',old.name,',money=',old.money,'}'));
END$

DELIMITER ;

-- 删除account表中王五
DELETE FROM account WHERE id=3;

-- 查询account表
SELECT * FROM account;

-- 查询account_log表
SELECT * FROM account_log;