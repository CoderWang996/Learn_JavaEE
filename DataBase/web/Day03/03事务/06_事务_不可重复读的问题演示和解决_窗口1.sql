/*
	不可重复读的问题演示和解决
	不可重复读：一个事务中读取到了其他事务已提交的数据
*/
-- 设置事务隔离级别为read committed
SET GLOBAL TRANSACTION ISOLATION LEVEL READ COMMITTED;
SET GLOBAL TRANSACTION ISOLATION LEVEL REPEATABLE READ;

-- 开启事务
START TRANSACTION;

-- 转账
UPDATE account SET money = money-500 WHERE NAME='张三';
UPDATE account SET money = money+500 WHERE NAME='李四';

-- 查询account表
SELECT * FROM account;

-- 提交事务
COMMIT;