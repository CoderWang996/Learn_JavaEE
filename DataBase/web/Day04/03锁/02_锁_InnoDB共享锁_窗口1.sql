/*
	共享锁：数据可以被多个事务查询，但是不能修改
	创建锁的格式
		SELECT语句 LOCK IN SHARE MODE;
*/
-- 开启事务
START TRANSACTION;

-- 查询id为1数据，并加入共享锁
SELECT * FROM student WHERE id=1 LOCK IN SHARE MODE;

-- 查询分数为99的数据，并加入共享锁
SELECT * FROM student WHERE score=99 LOCK IN SHARE MODE;

-- 提交事务
COMMIT;