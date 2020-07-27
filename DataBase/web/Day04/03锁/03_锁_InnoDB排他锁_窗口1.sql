/*
	排他锁：加锁的数据，不能被其他事务加锁查询或修改
	排他锁创建格式
		SELECT语句 FOR UPDATE;
*/
-- 开启事务
START TRANSACTION;

-- 查询id为1数据，并加入排他锁
SELECT * FROM student WHERE id=1 FOR UPDATE;

-- 提交事务
COMMIT;