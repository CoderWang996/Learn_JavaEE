/*
	ALTER添加索引
	-- 普通索引
	ALTER TABLE 表名 ADD INDEX 索引名称(列名);

	-- 组合索引
	ALTER TABLE 表名 ADD INDEX 索引名称(列名1,列名2,...);

	-- 主键索引
	ALTER TABLE 表名 ADD PRIMARY KEY(主键列名); 

	-- 外键索引(添加外键约束，就是外键索引)
	ALTER TABLE 表名 ADD CONSTRAINT 外键名 FOREIGN KEY (本表外键列名) REFERENCES 主表名(主键列名);

	-- 唯一索引
	ALTER TABLE 表名 ADD UNIQUE 索引名称(列名);

	-- 全文索引
	ALTER TABLE 表名 ADD FULLTEXT 索引名称(列名);
*/
-- 为student表中score列添加唯一索引
ALTER TABLE student ADD UNIQUE idx_score(score);


-- 查询student表的索引
SHOW INDEX FROM student;



/*
	删除索引
	DROP INDEX 索引名称 ON 表名;
*/
-- 删除idx_score索引
DROP INDEX idx_score ON student;