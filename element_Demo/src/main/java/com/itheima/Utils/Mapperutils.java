package com.itheima.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//工具类
public class Mapperutils {
    private Mapperutils(){}
    private static SqlSessionFactory factory=null;
    private static InputStream is=null;
    //静态代码块
    static {
        try {
            //加载配置文件
          is = Resources.getResourceAsStream("sql.xml");
            //获取SqlSession工厂对象
             factory = new SqlSessionFactoryBuilder().build(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //获取Sqlsession的静态方法
    public static SqlSession getsession(){
        //获取session对象
        SqlSession session = factory.openSession();
        return session;
    }
    //提交事务并释放资源
    public static void close(SqlSession session){
        session.commit();
        if (session!=null){
            session.close();
        }
        if (is!=null){
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
