package com.itheima04;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/*
    1.通过Properties集合，加载配置文件
    2.通过Druid连接池工厂类获取数据库连接池对象
    3.通过连接池对象获取数据库连接进行使用
 */
public class DruidTest1 {
    public static void main(String[] args) throws Exception{
        //获取配置文件的流对象
        InputStream is = DruidTest1.class.getClassLoader().getResourceAsStream("druid.properties");

        //1.通过Properties集合，加载配置文件
        Properties prop = new Properties();
        prop.load(is);

        //2.通过Druid连接池工厂类获取数据库连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        //3.通过连接池对象获取数据库连接进行使用
        Connection con = dataSource.getConnection();


        String sql = "SELECT * FROM student";
        PreparedStatement pst = con.prepareStatement(sql);

        //4.执行sql语句，接收结果集
        ResultSet rs = pst.executeQuery();

        //5.处理结果集
        while(rs.next()) {
            System.out.println(rs.getInt("sid") + "\t" + rs.getString("name") + "\t" + rs.getInt("age") + "\t" + rs.getDate("birthday"));
        }

        //6.释放资源
        rs.close();
        pst.close();
        con.close();
    }
}
