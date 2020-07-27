-- 从服务器：查询学生表，可以看到数据(因为有主从复制)
SELECT * FROM student;

-- 从服务器：删除一条记录。(主服务器并没有删除，mycat中间件查询的结果是从服务器的数据)
DELETE FROM student WHERE id=2;