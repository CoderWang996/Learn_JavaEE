package com.itheima.springboot_mybatis;

import com.itheima.springboot_mybatis.domain.User;
import com.itheima.springboot_mybatis.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class test1 {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void t(){
        List<User> users = userMapper.findAll();
        System.out.println(users);
    }
}
