package com.itheima.mapper;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM `user` WHERE id=#{user_id}")
    @Results(id = "UserMap",value ={
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "username",property = "username"),
            @Result(column = "birthday",property = "birthday"),
            @Result(column = "sex",property = "sex"),
            @Result(column = "address",property = "address"),
            @Result(
                    property = "items",//被包含对象的变量名
                    javaType = List.class,//被包含对象的实际数据类型
                    column = "id",//根据user表中的id查询items表
                    many = @Many(select = "com.itheima.mapper.ItemsMapper.findById",fetchType = FetchType.LAZY)
            )
    })
    List<User> findByUid(int user_id);
}
