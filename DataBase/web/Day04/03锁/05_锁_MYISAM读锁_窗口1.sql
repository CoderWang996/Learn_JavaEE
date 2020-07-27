/*
	读锁：所有连接只能读取数据，不能修改
	加锁
		LOCK TABLE 表名 READ;

	解锁
		UNLOCK TABLES;
*/
-- 为product表添加读锁
LOCK TABLE product READ;

-- 查询id为1数据
SELECT * FROM product WHERE id=1;

-- 修改id为1数据，将金额修改4999
UPDATE product SET price = 4999 WHERE id=1;

-- 解锁
UNLOCK TABLES;