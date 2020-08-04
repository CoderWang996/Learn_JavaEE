package com.itheima.Demo;

import com.itheima.domain.Items;
import com.itheima.domain.Orders;
import com.itheima.domain.User;
import com.itheima.mapper.OrderMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws Exception{
        InputStream is = Resources.getResourceAsStream("sql.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession(true);
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        List<Orders> orders = mapper.Test4_find();
        for (Orders order : orders) {
            System.out.println("订单信息："+order);
            List<User> users = order.getUsers();
            for (User user : users) {
                System.out.println("用户信息："+user);
                for (Items item : user.getItems()) {
                    System.out.println("商品信息："+item);
                }
            }
        }
        sqlSession.close();
        is.close();
    }
}
