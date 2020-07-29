package Demo1;

import java.sql.*;
import java.text.SimpleDateFormat;

public class JDBCDemo01 {
    public static void main(String[] args) throws Exception {
        //注册驱动
       Class.forName("com.mysql.jdbc.Driver");
       //获取数据库连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.23.129:3306/db14","root","1123");
        //获取执行者对象
        Statement statement = connection.createStatement();
        //执行mysql语句并返回结果
        ResultSet resultSet = statement.executeQuery("SELECT * FROM student");
        //处理结果
        while (resultSet.next()){
            System.out.print("sid:"+resultSet.getInt("sid")+" ");
            System.out.print("name:"+resultSet.getString("name")+" ");
            System.out.print("age:"+resultSet.getInt("age")+" ");
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date birthday = resultSet.getDate("birthday");
            String s = format.format(birthday);
            System.out.println("birthday:"+s+" ");
        }
        //释放资源
        resultSet.close();
        statement.close();
        connection.close();
    }
}
