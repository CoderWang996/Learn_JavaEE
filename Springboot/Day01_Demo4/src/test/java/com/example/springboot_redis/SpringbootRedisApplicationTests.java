package com.example.springboot_redis;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void TestSet(){
        //存入数据
        redisTemplate.boundValueOps("name").set("WangChenyang");
    }
    @Test
    public void TestGet(){
        //获取数据
        String name = (String) redisTemplate.boundValueOps("name").get();
        System.out.println(name);
    }
}
