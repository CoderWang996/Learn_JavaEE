-- 创建city表
CREATE TABLE city(
	id INT PRIMARY KEY AUTO_INCREMENT,  -- 城市id
	NAME VARCHAR(20),                   -- 城市名称
	VERSION INT                         -- 版本号
);

-- 添加数据
INSERT INTO city VALUES (NULL,'北京',1),(NULL,'上海',1),(NULL,'广州',1),(NULL,'深圳',1);


-- 将北京修改为北京市
-- 1.将北京的版本号读取出来
SELECT VERSION FROM city WHERE NAME='北京';   -- 1
-- 2.修改北京为北京市，版本号+1.并对比版本号是否相同
UPDATE city SET NAME='北京市',VERSION=VERSION+1 WHERE NAME='北京' AND VERSION=1;