-- 查询id为1数据
SELECT * FROM product WHERE id=1;

-- 修改id为1数据，将金额改成5999(修改失败，只有窗口1解锁后才能修改成功)
UPDATE product SET price=5999 WHERE id=1;