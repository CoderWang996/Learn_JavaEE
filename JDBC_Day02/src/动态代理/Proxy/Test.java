package 动态代理.Proxy;

import 动态代理.Utils.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        Myds myds = new Myds();
        System.out.println("使用前的数量为"+myds.getSize());
        try {
            Connection connection = myds.getConnection();
            String sql = "SELECT * FROM student";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt("sid") + "\t" + rs.getString("name") + "\t" + rs.getInt("age") + "\t" + rs.getDate("birthday"));
            }
            Util.close(connection,ps,rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("使用后的数量为"+myds.getSize());
    }
}
