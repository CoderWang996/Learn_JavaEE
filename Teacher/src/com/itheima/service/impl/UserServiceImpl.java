package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public User login(String email, String pwd) {
        User u=null;
        try {
            //1、读取核心配置文件
            InputStream is = Resources.getResourceAsStream("sql.xml");
            //2、构建工厂对象
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
            //3、获取SqlSession
            SqlSession session=factory.openSession();
            //4、获取Mapper代理对象
            UserMapper mapper = session.getMapper(UserMapper.class);
            //5、调用方法
           u= mapper.findByEmailAndPwd(email,pwd);
            //6、事务提交
            session.commit();
            //7、是否资源
            session.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return u;
    }

    @Override
    public List<User> findAll(int pageNum) {
        List<User> list=null;
        try {
            //1、读取核心配置文件
            InputStream is = Resources.getResourceAsStream("sql.xml");
            //2、构建工厂对象
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
            //3、获取SqlSession
            SqlSession session=factory.openSession();
            //4、获取Mapper代理对象
            UserMapper mapper = session.getMapper(UserMapper.class);

            //设置分页参数：当前页码，每页显示条目数
            PageHelper.startPage(pageNum,2);
            //5、调用方法
            list=mapper.findAll();
            //6、事务提交
            session.commit();
            //7、是否资源
            session.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
