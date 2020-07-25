/*
	显示内连接
	标准语法：
		SELECT 列名 FROM 表名1 [INNER] JOIN 表名2 ON 关联条件;
*/
-- 查询用户信息和对应的订单信息
SELECT * FROM 	USER INNER JOIN orderlist ON orderlist.uid = user.id;

-- 查询用户信息和对应的订单信息，起别名
SELECT * FROM USER u INNER JOIN orderlist o ON o.uid=u.id;


-- 查询用户姓名，年龄。和订单编号
SELECT
	u.name,		-- 用户姓名
	u.age,		-- 用户年龄
	o.number	-- 订单编号
FROM
	USER u          -- 用户表
INNER JOIN
	orderlist o     -- 订单表
ON
	o.uid=u.id;
	
	
select 
    u.`NAME`,
    u.`age`,
    o.`number`
from
        db5.`USER` u
inner join
     db5.`orderlist` o
on
     u.`id`=o.`uid`;

/*
	隐式内连接
	标准语法：
		SELECT 列名 FROM 表名1,表名2 WHERE 关联条件;
*/
-- 查询用户姓名，年龄。和订单编号
select 
      u.`NAME`,
      u.`age`,
      o.`number`
from 
     db5.`USER` u,
     db5.`orderlist` o
where 
     u.`id`=o.`uid`;
      
