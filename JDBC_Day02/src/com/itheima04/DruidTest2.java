package com.itheima04;

import com.itheima.utils.DataSourceUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DruidTest2 {
    public static void main(String[] args) throws Exception{
        //1.通过连接池工具类获取一个数据库连接
        Connection con = DataSourceUtils.getConnection();

        String sql = "SELECT * FROM student";
        PreparedStatement pst = con.prepareStatement(sql);

        //2.执行sql语句，接收结果集
        ResultSet rs = pst.executeQuery();

        //3.处理结果集
        while(rs.next()) {
            System.out.println(rs.getInt("sid") + "\t" + rs.getString("name") + "\t" + rs.getInt("age") + "\t" + rs.getDate("birthday"));
        }

        //4.释放资源
        DataSourceUtils.close(con,pst,rs);
    }
}
