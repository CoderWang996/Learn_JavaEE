/*
	查询数据库支持的存储引擎
	SHOW ENGINES;
*/
-- 查询数据库支持的存储引擎
SHOW ENGINES;



/*
	查询某个数据库中所有数据表的存储引擎
	SHOW TABLE STATUS FROM 数据库名称;
*/
-- 查询db4数据库所有表的存储引擎
SHOW TABLE STATUS FROM db4;



/*
	查询某个数据库中某个表的存储引擎
	SHOW TABLE STATUS FROM 数据库名称 WHERE NAME = '数据表名称';
*/
-- 查看db4数据库中category表的存储引擎
SHOW TABLE STATUS FROM db4 WHERE NAME = 'category';



/*
	创建数据表指定存储引擎
	CREATE TABLE 表名(
	      列名,数据类型,
	      ...
	)ENGINE = 引擎名称;
*/
CREATE TABLE engine_test(
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(10)
)ENGINE = MYISAM;

SHOW TABLE STATUS FROM db4;

/*
	修改数据表的存储引擎
	ALTER TABLE 表名 ENGINE = 引擎名称;
*/
-- 修改engine_test表的存储引擎为InnoDB
ALTER TABLE engine_test ENGINE = INNODB;
