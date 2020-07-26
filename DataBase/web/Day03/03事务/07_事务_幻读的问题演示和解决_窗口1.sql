/*
	幻读的问题演示和解决
	查询某记录是否存在，不存在
	准备插入此记录，但执行插入时发现此记录已存在，无法插入
	或某记录不存在执行删除，却发现删除成功
*/
-- 设置隔离级别为repeatable read
SET GLOBAL TRANSACTION ISOLATION LEVEL REPEATABLE READ;
SET GLOBAL TRANSACTION ISOLATION LEVEL SERIALIZABLE;

-- 开启事务
START TRANSACTION;

-- 添加记录
INSERT INTO account VALUES (3,'王五',2000);
INSERT INTO account VALUES (4,'赵六',3000);

-- 查询account表
SELECT * FROM account;

-- 提交事务
COMMIT;