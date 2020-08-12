package com.itheima.service.iml;

import com.itheima.Utils.Mapperutils;
import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
import org.apache.ibatis.session.SqlSession;

public class UserServiceIml implements UserService {
    //查询用户信息
    @Override
    public User findUser(User u) {
        //获取SqlSession对象
        SqlSession session = Mapperutils.getsession();
        //获取代理对象
        UserMapper mapper = session.getMapper(UserMapper.class);
        //执行查询语句
        User user =mapper.findUser(u);
        //释放资源
        Mapperutils.close(session);
        //返回查询结果
        return user;
    }
}
