package com.itheima.service.iml;

import com.itheima.domain.User;
import com.itheima.mapper.userMapper;
import com.itheima.service.userService;
import com.itheima.utils.Mapperutils;
import org.apache.ibatis.session.SqlSession;
import java.util.List;

//持久层实现类
public class userServiceiml implements userService {

    //登录功能
    @Override
    public User login(String email, String password) {
        SqlSession session = Mapperutils.getsession();
        //获取代理对象
        userMapper mapper = session.getMapper(userMapper.class);
        //执行代理对象中的方法
        User user = mapper.findByEmailAndPwd(email, password);
        //提交事务并释放资源
        Mapperutils.close(session);
        return user;
    }

    //查询所有
    @Override
    public List<User> list() {
        SqlSession session = Mapperutils.getsession();
        //获取代理对象
        userMapper mapper = session.getMapper(userMapper.class);
        //执行代理对象中的方法
        List<User> list = mapper.findAll();
        //提交事务并释放资源
        Mapperutils.close(session);
        return list;
    }
}
