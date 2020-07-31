package com.itheima02;

import java.sql.Connection;
import java.util.List;

/*
    1.定义一个类，继承适配器类
    2.定义连接对象和连接池容器对象的成员变量
    3.通过有参构造为变量赋值
    4.重写close方法，完成归还连接
 */
//1.定义一个类，继承适配器类
public class MyConnection3 extends MyAdapter {

    //2.定义连接对象和连接池容器对象的成员变量
    private Connection con;
    private List<Connection> pool;

    //3.通过有参构造为变量赋值
    public MyConnection3(Connection con,List<Connection> pool) {
        super(con);
        this.con = con;
        this.pool = pool;
    }

    //4.重写close方法，完成归还连接
    @Override
    public void close() {
        pool.add(con);
    }
}
