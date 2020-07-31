package com.itheima01;

import com.itheima.utils.JDBCUtils;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class MyDataSource implements DataSource {
    //1.准备一个容器。用于保存多个数据库连接对象
    private static List<Connection> pool = Collections.synchronizedList(new ArrayList<>());

    //2.定义静态代码块,获取多个连接对象保存到容器中
    static{
        for(int i = 1; i <= 10; i++) {
            Connection con = JDBCUtils.getConnection();
            pool.add(con);
        }
    }

    //4.提供一个获取连接池大小的方法
    public int getSize() {
        return pool.size();
    }

    /*
        动态代理方式
     */
    @Override
    public Connection getConnection() throws SQLException {
        if(pool.size() > 0) {
            Connection con = pool.remove(0);

            Connection proxyCon = (Connection) Proxy.newProxyInstance(con.getClass().getClassLoader(), new Class[]{Connection.class}, new InvocationHandler() {
                /*
                    执行Connection实现类连接对象所有的方法都会经过invoke
                    如果是close方法，归还连接
                    如果不是，直接执行连接对象原有的功能即可
                 */
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if(method.getName().equals("close")) {
                        //归还连接
                        pool.add(con);
                        return null;
                    }else {
                        return method.invoke(con,args);
                    }
                }
            });

            return proxyCon;
        }else {
            throw new RuntimeException("连接数量已用尽");
        }
    }

    //3.重写getConnection方法，用于返回一个连接对象
    /*@Override
    public Connection getConnection() throws SQLException {
        if(pool.size() > 0) {
            Connection con = pool.remove(0);
            //通过自定义的连接对象 对原有的连接对象进行包装
            //MyConnection2 myCon = new MyConnection2(con,pool);
            MyConnection3 myCon = new MyConnection3(con,pool);
            return myCon;
        }else {
            throw new RuntimeException("连接数量已用尽");
        }
    }*/

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
