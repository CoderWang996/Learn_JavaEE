/*
	结果是单行单列的
	标准语法：
		SELECT 列名 FROM 表名 WHERE 列名=(SELECT 列名 FROM 表名 [WHERE 条件]);
*/
-- 查询年龄最高的用户姓名
SELECT db5.`USER`.`NAME` FROM db5.`USER` WHERE db5.`USER`.`age`=(SELECT MAX(db5.`USER`.`age`) FROM db5.`USER`);


/*
	结果是多行单列的
	标准语法：
		SELECT 列名 FROM 表名 WHERE 列名 [NOT] IN (SELECT 列名 FROM 表名 [WHERE 条件]); 
*/
-- 查询张三和李四的订单信息
SELECT * FROM db5.`orderlist` WHERE db5.`orderlist`.`uid` IN (SELECT db5.`USER`.`id` FROM db5.`USER`
 WHERE db5.`USER`.`NAME` IN ('张三','李四'));


/*
	结果是多行多列的
	标准语法：
		SELECT 列名 FROM 表名 [别名],(SELECT 列名 FROM 表名 [WHERE 条件]) [别名] [WHERE 条件];
*/
-- 查询订单表中id大于4的订单信息和所属用户信息
select
     o.*,
     u.*
from
    db5.`USER` u,
    (select * from orderlist where orderlist.`id`>4) o
      
where
     o.uid=u.`id`;