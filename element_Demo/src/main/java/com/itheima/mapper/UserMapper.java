package com.itheima.mapper;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("SELECT * FROM `user` WHERE username=#{username} AND password=#{password}")
    User findUser(User u);
}
