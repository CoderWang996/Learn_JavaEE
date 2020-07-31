package com.itheima01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MyDataSourceTest {
    public static void main(String[] args) throws Exception{
        //1.创建连接池对象
        MyDataSource dataSource = new MyDataSource();

        System.out.println("使用之前的数量：" + dataSource.getSize());

        //2.通过连接池对象获取连接对象
        Connection con = dataSource.getConnection();
        System.out.println(con.getClass());

        //3.查询学生表的全部信息
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
        con.close();    // 用完以后，关闭连接

        System.out.println("使用之后的数量：" + dataSource.getSize());
    }
}
