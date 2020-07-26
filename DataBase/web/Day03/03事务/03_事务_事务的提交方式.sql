/*
	查询事务提交方式：SELECT @@AUTOCOMMIT;  -- 1代表自动提交    0代表手动提交
	修改事务提交方式：SET @@AUTOCOMMIT=数字;
*/
-- 查询事务的提交方式
SELECT @@autocommit;

UPDATE account SET money=2000 WHERE id=1;

COMMIT;


-- 修改事务的提交方式
SET @@autocommit = 1;
