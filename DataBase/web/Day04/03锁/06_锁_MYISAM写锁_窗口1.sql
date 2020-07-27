/*
	写锁：其他连接不能查询和修改数据
	加锁
		LOCK TABLE 表名 WRITE;

	解锁
		UNLOCK TABLES;
*/
-- 为product表添加写锁
LOCK TABLE product WRITE;

-- 查询
SELECT * FROM product;

-- 修改
UPDATE product SET price=1999 WHERE id=2;

-- 解锁
UNLOCK TABLES;