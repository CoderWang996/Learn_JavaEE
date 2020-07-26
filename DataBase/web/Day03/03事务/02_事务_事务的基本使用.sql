-- 张三给李四转账500元

-- 开启事务
START TRANSACTION;

-- 1.张三账户-500
UPDATE account SET money=money-500 WHERE NAME='张三';

 出错了...

-- 2.李四账户+500
UPDATE account SET money=money+500 WHERE NAME='李四';

-- 回滚事务
ROLLBACK;

-- 提交事务
COMMIT;