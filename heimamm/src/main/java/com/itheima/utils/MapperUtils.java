package com.itheima.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//抽取获取SQLSession对象以及提交事务并释放资源的工具类
public class MapperUtils {
    private MapperUtils(){}
    private static SqlSessionFactory factory=null;
    private static InputStream is=null;
    //静态代码块
    static {
        try {
            //读取核心配置文件
            is= Resources.getResourceAsStream("sql.xml");
            //获取工厂对象
            factory = new SqlSessionFactoryBuilder().build(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //获取session对象的静态方法
    public static SqlSession getsession(){
        //获取session对象
        SqlSession session = factory.openSession();
        return session;
    }
    //提交事务并释放资源
    public static void close(SqlSession session){
        //提交事务
        session.commit();
        //释放资源
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
