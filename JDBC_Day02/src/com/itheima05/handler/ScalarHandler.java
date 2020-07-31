package com.itheima05.handler;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/*
    1.定义一个类，实现ResultSetHandler接口
    2.重写handler方法
    3.定义一个Long类型变量
    4.判断结果集对象中是否还有数据
    5.获取结果集源信息的对象
    6.获取第一列的列名
    7.根据列名获取该列的值
    8.返回结果
 */
//1.定义一个类，实现ResultSetHandler接口
public class ScalarHandler<T> implements ResultSetHandler<T> {

    //2.重写handler方法
    @Override
    public Long handler(ResultSet rs) {
        //3.定义一个Long类型变量
        Long value = null;
        try{
            //4.判断结果集对象中是否还有数据
            if(rs.next()) {
                //5.获取结果集源信息的对象
                ResultSetMetaData metaData = rs.getMetaData();
                //6.获取第一列的列名
                String columnName = metaData.getColumnName(1);
                //7.根据列名获取该列的值
               value = rs.getLong(columnName);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        //8.返回结果
        return value;
    }
}
