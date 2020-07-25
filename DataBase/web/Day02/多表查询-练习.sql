-- 1.查询用户的编号、姓名、年龄。订单编号
/*
分析
	用户的编号、姓名、年龄  user表      订单编号 orderlist表
	条件：user.id=orderlist.uid
*/
SELECT
      db5.`USER`.`id`,
      db5.`USER`.`NAME`,
      db5.`USER`.`age`,
      db5.`orderlist`.`number`
FROM
      db5.`USER`,
      db5.`orderlist`
WHERE
       db5.`USER`.id=db5.`orderlist`.`uid`;

-- 2.查询所有的用户。用户的编号、姓名、年龄。订单编号
/*
分析
	用户的编号、姓名、年龄  user表    订单编号 orderlist表
	条件：user.id=orderlist.uid
	查询所有的用户，左外连接
*/
SELECT
     db5.`USER`.`id`,
     db5.`USER`.`NAME`,
     db5.`USER`.`age`,
     db5.`orderlist`.`number`
FROM
     db5.`USER`
LEFT OUTER JOIN
     db5.`orderlist`
ON
     db5.`USER`.`id`=db5.`orderlist`.`uid`;


-- 3.查询所有的订单。用户的编号、姓名、年龄。订单编号
/*
分析
	用户的编号、姓名、年龄 user表    订单编号 orderlist表
	条件：user.id=orderlist.uid
	查询所有的订单，右外连接
*/
SELECT
      db5.`USER`.`id`,
      db5.`USER`.`NAME`,
      db5.`USER`.`age`,
      db5.`orderlist`.`number`
FROM
     db5.`USER`
RIGHT OUTER JOIN
     db5.`orderlist`
ON
     db5.`USER`.`id`=db5.`orderlist`.`uid`;
	

-- 4.查询用户年龄大于23岁的信息。显示用户的编号、姓名、年龄。订单编号
/*
分析
	用户的编号、姓名、年龄 user表    订单编号 orderlist表
	条件：user.id=orderlist.uid AND user.age > 23
*/
SELECT
     db5.`USER`.`id`,
     db5.`USER`.`NAME`,
     db5.`USER`.`age`,
     db5.`orderlist`.`number`
FROM
    db5.`USER`,
    db5.`orderlist`
WHERE
     db5.`USER`.`age`>23
     AND
     db5.`USER`.`id`=db5.`orderlist`.`uid`;


-- 5.查询张三和李四用户的信息。显示用户的编号、姓名、年龄。订单编号
/*
分析
	用户的编号、姓名、年龄 user表   订单编号 orderlist表
	条件：user.id=orderlist.uid AND user.name IN ('张三','李四')
*/
SELECT
      db5.`USER`.*,
      db5.`orderlist`.`number`
FROM
      db5.`USER`,
      db5.`orderlist`
WHERE
      db5.`USER`.`NAME` IN ('张三','李四')
      AND
      db5.`USER`.`id`=db5.`orderlist`.`uid`;


-- 6.查询商品分类的编号、分类名称。分类下的商品名称
/*
分析
	商品分类的编号、分类名称 category表    商品名称 product表
	条件：category.id=product.cid
*/
SELECT 
      db5.`category`.*,
      db5.`product`.`NAME`
FROM
      db5.`category`,
      db5.`product`
WHERE
      db5.`category`.`id`=db5.`product`.`cid`;


-- 7.查询所有的商品分类。商品分类的编号、分类名称。分类下的商品名称
/*
分析
	商品分类的编号、分类名称 category表    商品名称 product表
	条件：category.id=product.cid
	查询所有的商品分类，左外连接
*/
SELECT
     db5.`category`.*,
     db5.`product`.`NAME`
FROM
     db5.`category`
LEFT OUTER JOIN
     db5.`product`
ON
     db5.`category`.`id`=db5.`product`.`cid`;

-- 8.查询所有的商品信息。商品分类的编号、分类名称。分类下的商品名称
/*
分析
	商品分类的编号、分类名称  category表   商品名称 product表
	条件：category.id=product.cid
	查询所有的商品信息，右外连接
*/
SELECT 
      db5.`category`.*,
      db5.`product`.`NAME`
FROM 
      db5.`category`
RIGHT OUTER JOIN
      db5.`product`
ON
      db5.`category`.`id`=db5.`product`.`cid`;


-- 9.查询所有的用户和该用户能查看的所有的商品。显示用户的编号、姓名、年龄。商品名称
/*
分析
	用户的编号、姓名、年龄 user表   商品名称 product表    中间表 us_pro
	条件：us_pro.uid=user.id AND us_pro.pid=product.id
*/
SELECT 
     db5.`USER`.*,
     db5.`product`.`NAME`
FROM
     db5.`USER`,
     db5.`us_pro`,
     db5.`product`
WHERE
     db5.`USER`.`id`=db5.`us_pro`.`uid`
     AND
     db5.`us_pro`.`pid`=db5.`product`.`id`;
    
    
 -- 9.查询所有的用户和该用户能查看的商品的名称。显示用户的编号、姓名、年龄。商品名称
/*
分析
	用户的编号、姓名、年龄 user表   商品名称 product表    中间表 us_pro
	条件：us_pro.uid=user.id AND us_pro.pid=product.id
*/
   SELECT 
     db5.`USER`.*,
     db5.`product`.`NAME`
FROM
      db5.`USER`
LEFT OUTER JOIN
      db5.`us_pro`
ON
      (db5.`USER`.`id`=db5.`us_pro`.`uid`)
LEFT OUTER JOIN
      db5.`product`
ON
       (db5.`us_pro`.`pid`=db5.`product`.`id`);

-- 10.查询张三和李四这两个用户可以看到的商品。显示用户的编号、姓名、年龄。商品名称
/*
分析
	用户的编号、姓名、年龄 user表   商品名称 product表   中间表 us_pro
	条件：us_pro.uid=user.id AND us_pro.pid=product.id AND user.name IN ('张三','李四') 
*/
SELECT
      db5.`USER`.*,
      db5.`product`.`NAME`
FROM
     db5.`USER`,
     db5.`product`,
     db5.`us_pro`
where
     db5.`USER`.`id`=db5.`us_pro`.`uid`
and
     db5.`product`.`id`=db5.`us_pro`.`pid`
and
     db5.`USER`.`NAME` in ('张三','李四');