package com.itheima.mapper;

import com.itheima.domain.Orderlist;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM `user`")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(
                    property = "orderlists",//被包含对象的变量名
                    javaType = List.class,//被包含对象的实际数据类型
                    column = "id",//根据从user表查询出的id查询orderlist表
                    /*
                    * many @Many 一对多固定写法
                    * */
                    many = @Many(select = "com.itheima.mapper.OrderMapper.findByUid")
            )
    })
    List<User> findUserAndOrder();
}
