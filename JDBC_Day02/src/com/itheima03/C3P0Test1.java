package com.itheima03;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C3P0Test1 {
    public static void main(String[] args) throws Exception{
        //1.创建c3p0的数据库连接池对象
        DataSource dataSource = new ComboPooledDataSource();

        //2.通过连接池对象获取数据库连接
        Connection con = dataSource.getConnection();

        //3.执行操作
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
