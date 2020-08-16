package com.itheima.service.iml;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
import com.itheima.utils.Mapperutils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserServiceIml implements UserService {
    //查询所有
    @Override
    public List<User> findAll() {
        //获取Sqlsession对象
        SqlSession session = Mapperutils.getsession();
        //获取代理对象
        UserMapper mapper = session.getMapper(UserMapper.class);
        //执行SQL语句
        List<User> list = mapper.findAll();
        //释放资源
        Mapperutils.close(session);
        return list;
    }

    //新增
    @Override
    public void insert(User user) {
        //获取Sqlsession对象
        SqlSession session = Mapperutils.getsession();
        //获取代理对象
        UserMapper mapper = session.getMapper(UserMapper.class);
        //执行SQL语句
        mapper.insert(user);
        //释放资源
        Mapperutils.close(session);
    }

    //修改
    @Override
    public void update(User user) {
        //获取Sqlsession对象
        SqlSession session = Mapperutils.getsession();
        //获取代理对象
        UserMapper mapper = session.getMapper(UserMapper.class);
        //执行SQL语句
        mapper.update(user);
        //释放资源
        Mapperutils.close(session);
    }

    //删除
    @Override
    public void delete(int id) {
        //获取Sqlsession对象
        SqlSession session = Mapperutils.getsession();
        //获取代理对象
        UserMapper mapper = session.getMapper(UserMapper.class);
        //执行SQL语句
        mapper.delete(id);
        //释放资源
        Mapperutils.close(session);
    }
}
