package com.itheima.springboot_mybatis.mapper;

import com.itheima.springboot_mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface UserMapper {
    @Select("select * from user")
    public List<User> findAll();
}
