package 动态代理.Utils;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Util {
    private Util(){}
    private static String classname;
    private static String url;
    private static String username;
    private static String password;
    private static Connection con;
    static {
        try{
            InputStream is = Util.class.getClassLoader().getResourceAsStream("config.properties");
            Properties properties = new Properties();
            properties.load(is);
            classname=properties.getProperty("classname");
            url=properties.getProperty("url");
            username=properties.getProperty("username");
            password=properties.getProperty("password");
            Class.forName(classname);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        try {
            con= DriverManager.getConnection(url,username,password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
    public static void close(Connection con, Statement stat, ResultSet rs){
        if (con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stat!=null){
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(Connection con, Statement stat){
        if (con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stat!=null){
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
