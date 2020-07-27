-- 开启事务
START TRANSACTION;

-- 查询id为1数据,(普通查询没问题)
SELECT * FROM student WHERE id=1;

-- 查询id为1数据,也加入共享锁(共享锁和共享锁是兼容)
SELECT * FROM student WHERE id=1 LOCK IN SHARE MODE;

-- 修改id为1数据，姓名改成张三三(修改失败。会出现锁的情况。只有窗口1提交事务后才能修改成功)
UPDATE student SET NAME='张三三' WHERE id=1;

-- 修改id为2数据，姓名改成李四四(修改成功，InnoDB引擎默认加的是行锁)
UPDATE student SET NAME='李四四' WHERE id=2;

-- 修改id为3数据，姓名改成王五五(修改失败，InnoDB引擎如果不采用带索引的列加锁，加的就是表锁)
UPDATE student SET NAME='王五五' WHERE id=3;


-- 提交事务
COMMIT;