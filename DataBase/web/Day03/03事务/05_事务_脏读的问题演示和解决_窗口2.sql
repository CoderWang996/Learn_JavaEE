-- 查询事务隔离级别
SELECT @@tx_isolation;

-- 开启事务
START TRANSACTION;

-- 查询account表
SELECT * FROM account;

-- 提交事务
COMMIT;