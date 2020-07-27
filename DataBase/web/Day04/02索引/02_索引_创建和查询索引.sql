/*
	创建索引
	CREATE [UNIQUE|FULLTEXT] INDEX 索引名称
	[USING 索引类型]  -- 默认是BTREE
	ON 表名(列名...);
*/
-- 为student表中的name列创建一个普通索引
CREATE INDEX idx_name ON student(NAME); 

-- 为student表中的age列创建一个唯一索引
CREATE UNIQUE INDEX idx_age ON student(age);


/*
	查询索引
	SHOW INDEX FROM 表名;
*/
-- 查询student表中的索引  (主键列自带主键索引)
SHOW INDEX FROM student;

-- 查询db4数据库中的product表 (外键列自带外键索引)
SHOW INDEX FROM product;