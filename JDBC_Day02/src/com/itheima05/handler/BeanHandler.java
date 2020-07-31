package com.itheima05.handler;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/*
    实现类1：用于将查询到的一条记录，封装为Student对象并返回
 */
//1.定义一个类，实现ResultSetHandler接口
public class BeanHandler<T> implements ResultSetHandler<T>{
    //2.定义Class对象类型变量
    private Class<T> beanClass;

    //3.通过有参构造为变量赋值
    public BeanHandler(Class<T> beanClass) {
        this.beanClass = beanClass;
    }

    //4.重写handler方法。用于将一条记录封装到自定义对象中
    @Override
    public T handler(ResultSet rs) {
        //5.声明自定义对象类型
        T bean = null;
        try {
            //6.创建传递参数的对象，为自定义对象赋值
            bean = beanClass.newInstance();

            //7.判断结果集中是否有数据
            if(rs.next()) {
                //8.通过结果集对象获取结果集源信息的对象
                ResultSetMetaData metaData = rs.getMetaData();
                //9.通过结果集源信息对象获取列数
                int count = metaData.getColumnCount();

                //10.通过循环遍历列数
                for(int i = 1; i <= count; i++) {
                    //11.通过结果集源信息对象获取列名
                    String columnName = metaData.getColumnName(i);

                    //12.通过列名获取该列的数据
                    Object value = rs.getObject(columnName);

                    //13.创建属性描述器对象，将获取到的值通过该对象的set方法进行赋值
                    PropertyDescriptor pd = new PropertyDescriptor(columnName.toLowerCase(),beanClass);
                    //获取set方法
                    Method writeMethod = pd.getWriteMethod();
                    //执行set方法，给成员变量赋值
                    writeMethod.invoke(bean,value);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //14.返回封装好的对象
        return bean;
    }
}
