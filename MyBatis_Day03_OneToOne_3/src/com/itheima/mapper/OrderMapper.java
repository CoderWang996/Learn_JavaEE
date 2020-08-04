package com.itheima.mapper;

import com.itheima.domain.Orderlist;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderMapper {
    //查找订单编号和其对应的用户姓名与年龄
    @Select("SELECT * FROM orderlist")
    @Results({
            @Result(column = "number",property = "number"),
            @Result(
                    property = "u",//被包含对象的变量名
                    javaType = User.class,//被包含对象的实际数据类型
                    column = "uid",//根据查询orderlist表中的uid查找user表
                    /*
                    * one @One 一对一固定写法
                    * selct属性： 指定哪个接口中的哪个方法
                    * */
                    one = @One(select = "com.itheima.mapper.UserMapper.findById")
            )
    })
    List<Orderlist> findOrderAndUser();
}
