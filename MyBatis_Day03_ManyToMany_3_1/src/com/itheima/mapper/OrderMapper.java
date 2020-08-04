package com.itheima.mapper;

import com.itheima.domain.Orders;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface OrderMapper {
    @Select("SELECT * FROM orders")
    @Results(id = "Test4_find",value = {
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "user_id",property = "user_id"),
            @Result(column = "number",property = "number"),
            @Result(column = "createtime",property = "createtime"),
            @Result(column = "note",property = "note"),
            @Result(
                    property = "users",//被包含对象的变量名
                    javaType = List.class,//被包含对象的实际数据类型
                    column = "user_id",//根据orders表中的user_id查询user表
                    many = @Many(select = "com.itheima.mapper.UserMapper.findByUid",fetchType = FetchType.LAZY)
            )
    })
    List<Orders> Test4_find();
}
