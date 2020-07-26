-- 查询隔离级别
SELECT @@tx_isolation;

-- 开启事务
START TRANSACTION;

-- 查询account表
SELECT * FROM account;

-- 添加
INSERT INTO account VALUES (3,'王五',2000);

-- 提交事务
COMMIT;