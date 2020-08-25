package com.controller;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.domain.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.service.UserService;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Test01 {
    //入门案例
    @Test
    public void Test1(){
        //加载配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
        //获取资源
        UserService us = (UserService) ctx.getBean("userService");
        us.say();
    }

    //三种方式获取Bean对象
    @Test
    public void Test2(){
        //加载配置文件
        ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
/*        //强制类型转换获取IOC容器中的Bean对象
        Student stu = (Student) ac.getBean("Stu");
        stu.eat();
        stu.study();
        System.out.println(stu.getBirthday()+","+stu.getAddress().getSaddr()+","+stu.getAge()+","+stu.getName());*/
        //通过字节码类型获取IOC容器中的Bean对象 (不能用于IOC容器中有多个相同的对象类型)
//        Student student=ac.getBean(Student.class);
//        student.study();
        //最好的方式获取IOC容器中的Bean对象
        Student stu = ac.getBean("Stu", Student.class);
        stu.eat();
    }
    //IOC容器的初始化和销毁
    @Test
    public void Test3(){
        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
        Student stu = ac.getBean("Stu", Student.class);
        ac.close();
    }
    //Druid 数据库连接测试(原始)
    @Test
    public void Test4() throws SQLException {
        //创建数据库连接池对象
        DruidDataSource dataSource = new DruidDataSource();
        //数据库连接四大基本特征
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://192.168.23.129:3306/db1");
        dataSource.setUsername("root");
        dataSource.setPassword("1123");
        //获取数据库连接对象
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println("数据库连接对象的地址是"+connection);
    }
    //Druid 数据库连接测试(Spring)
    @Test
    public void Test5() throws Exception {
        //加载配置文件并创建IOC容器
        ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
        //从IOC容器中获取数据源对象
        DataSource dataSourse = ac.getBean("dataSourse", DataSource.class);
        //获取连接对象
        Connection connection = dataSourse.getConnection();
        System.out.println("数据库连接对象的地址是"+connection);
    }
    //c3p0(Spring)
    @Test
    public void Test6() throws Exception{
        //1、创建IOC容器
        ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
        //从IOC容器中获取数据源对象
        DataSource dataSourse = ac.getBean("dataSourse1", DataSource.class);
        //获取连接对象
        Connection connection = dataSourse.getConnection();
        System.out.println("数据库连接对象的地址是"+connection);
    }
}
