package com.itheima.Demo;

import com.itheima.domain.Orderlist;
import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws Exception{
        //读取核心配置文件
        InputStream is = Resources.getResourceAsStream("sql.xml");
        //获取SqlSession工厂对象
        SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
        //获取SqlSession对象并开启自动提交事务
        SqlSession session = fac.openSession(true);
        //获取mapper对象
        UserMapper mapper = session.getMapper(UserMapper.class);
        //执行方法
        List<User> list = mapper.findUserAndOrder();
        //遍历集合并打印结果
        for (User user : list) {
            System.out.println("用户编号："+user.getId());
            System.out.println("用户姓名："+user.getName());
            for (Orderlist orderlist : user.getOrderlists()) {
                System.out.println("订单编号："+orderlist.getNumber());
            }
        }
        //释放资源
        session.close();
        is.close();
    }
}
