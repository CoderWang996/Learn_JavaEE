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
-- 创建UPDATE型触发器。用于对account表修改数据进行日志的记录
DELIMITER $

CREATE TRIGGER account_update
AFTER UPDATE
ON account
FOR EACH ROW
BEGIN
	INSERT INTO account_log VALUES (NULL,'UPDATE',NOW(),new.id,CONCAT('更新前{id=',old.id,',name=',old.name,',money=',old.money,'}','更新后{id=',new.id,',name=',new.name,',money=',new.money,'}'));
END$

DELIMITER ;


-- 修改account表中李四的金额为2000
UPDATE account SET money=2000 WHERE id=2;

-- 查询account表
SELECT * FROM account;

-- 查询account_log表
SELECT * FROM account_log;