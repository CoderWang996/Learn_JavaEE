-- 查询(查询失败，只有窗口1解锁后才能查询成功)
SELECT * FROM product;

-- 修改(修改失败，只有窗口1解锁后才能修改成功)
UPDATE product SET price=2999 WHERE id=2;