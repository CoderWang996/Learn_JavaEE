package com.itheima.Demo;

import com.itheima.domain.Orderlist;
import com.itheima.mapper.OrderMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

//多表关系一对多查询
public class Demo1 {
    public static void main(String[] args) throws Exception{
        //读取核心配置文件
        InputStream is = Resources.getResourceAsStream("sql.xml");
        //获取SqlSession工厂对象
        SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
        //获取SqlSession对象并开启自动提交事务
        SqlSession session = fac.openSession(true);
        //获取mapper对象
        OrderMapper mapper = session.getMapper(OrderMapper.class);
        List<Orderlist> list = mapper.findOrderAndUser();
        //遍历集合并打印结果
        for (Orderlist orderlist : list) {
            System.out.println("订单编号为："+orderlist.getNumber());
            System.out.println("用户姓名为："+orderlist.getU().getName());
            System.out.println("用户年龄为："+orderlist.getU().getAge());
        }
        //释放资源
        session.close();
        is.close();
    }
}
