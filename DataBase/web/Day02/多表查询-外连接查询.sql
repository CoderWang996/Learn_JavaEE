/*
	左外连接
	标准语法：
		SELECT 列名 FROM 表名1 LEFT [OUTER] JOIN 表名2 ON 条件;
*/
-- 查询所有用户信息，以及用户对应的订单信息
SELECT
      u.*,
      o.`number`
FROM
     db5.`USER` u
LEFT OUTER JOIN
     db5.`orderlist` o
ON	
     o.`uid`=u.`id`;


/*
	右外连接
	标准语法：
		SELECT 列名 FROM 表名1 RIGHT [OUTER] JOIN 表名2 ON 条件;
*/
-- 查询所有订单信息，以及订单所属的用户姓名,年龄
SELECT
     o.*,
     u.`NAME`,
     u.`age`
from
     db5.`USER`u
right outer join
     db5.`orderlist` o
on
   u.`id`=o.`uid`;