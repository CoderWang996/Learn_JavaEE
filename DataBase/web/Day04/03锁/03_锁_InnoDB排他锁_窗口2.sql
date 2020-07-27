-- 开启事务
START TRANSACTION;

-- 查询id为1数据(普通查询没问题)
SELECT * FROM student WHERE id=1;

-- 查询id为1数据,并加入共享锁(排他锁和共享锁是不兼容的)
SELECT * FROM student WHERE id=1 LOCK IN SHARE MODE;

-- 查询id为1数据，并加入排他锁(排他锁和排他锁是不兼容的)
SELECT * FROM student WHERE id=1 FOR UPDATE;

-- 修改id为1数据，将姓名改成张三(修改失败，会出现锁的情况。只有窗口1提交事务后才能修改成功)
UPDATE student SET NAME='张三' WHERE id=1;

-- 提交事务
COMMIT;