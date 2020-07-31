package 动态代理.Proxy;

import com.sun.deploy.security.SelectableSecurityManager;
import sun.font.DelegatingShape;
import 动态代理.Utils.Util;

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

public class Myds implements DataSource {
    private static List<Connection> pool= Collections.synchronizedList(new ArrayList<>());
    static {
        for (int i = 0; i < 10; i++) {
            Connection connection = Util.getConnection();
            pool.add(connection);
        }
    }
    public int getSize(){
        return pool.size();
    }
    @Override
    public Connection getConnection() throws SQLException {
        if (pool.size()>0){
            Connection c = pool.remove(0);
            Connection Procon = (Connection) Proxy.newProxyInstance(c.getClass().getClassLoader(), new Class[]{Connection.class}, new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if (method.getName().equals("close")) {
                        pool.add(c);
                        return null;
                    } else {
                        return method.invoke(c, args);
                    }
                }
            });
            return Procon;
        }
        else{
            throw new RuntimeException("连接数量已用尽");
        }
    }

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
