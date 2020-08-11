package com.itheima.mapper;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface userMapper {
    //根据用户邮箱和密码查询
    User findByEmailAndPwd(@Param("email") String email, @Param("password") String password);
    //查询所有
    List<User> findAll();
}
