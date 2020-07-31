package com.itheima02;

import com.mysql.jdbc.JDBC4Connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

/*
    自定义的连接对象
    1.定义一个类，继承JDBC4Connection
    2.定义Connection连接对象和容器对象的成员变量
    3.通过有参构造方法为成员变量赋值
    4.重写close方法，完成归还连接
 */
public class MyConnection1 extends JDBC4Connection{//1.定义一个类，继承JDBC4Connection
    //2.定义Connection连接对象和容器对象的成员变量
    private Connection con;
    private List<Connection> pool;

    //3.通过有参构造方法为成员变量赋值
    public MyConnection1(String hostToConnectTo, int portToConnectTo, Properties info, String databaseToConnectTo, String url,Connection con,List<Connection> pool) throws SQLException {
        super(hostToConnectTo, portToConnectTo, info, databaseToConnectTo, url);
        this.con = con;
        this.pool = pool;
    }

    //4.重写close方法，完成归还连接
    @Override
    public void close() throws SQLException {
        pool.add(con);
    }
}
