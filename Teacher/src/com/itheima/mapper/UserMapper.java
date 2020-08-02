package com.itheima.mapper;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
* 持久层接口
* */
public interface UserMapper {
    //通过邮箱和密码登录
    //@Param:指定占位符中获取对应参数的变量名
    User findByEmailAndPwd(@Param("em") String email, @Param("pwd") String pwd);

    List<User> findAll();
}
