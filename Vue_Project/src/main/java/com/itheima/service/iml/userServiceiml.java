package com.itheima.service.iml;

import com.itheima.domain.User;
import com.itheima.mapper.userMapper;
import com.itheima.service.userService;
import com.itheima.utils.Mapperutils;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

//持久层实现类
public class userServiceiml implements userService {

    //查询所有
    @Override
    public List<User> findAll() {
        //获取session对象
        SqlSession session = Mapperutils.getsession();
        userMapper mapper = session.getMapper(userMapper.class);
        List<User> list = mapper.findAll();
        return list;
    }

    //新增功能
    @Override
    public void save(User user) {
        //获取session对象
        SqlSession session = Mapperutils.getsession();
        //获取映射对象
        userMapper mapper = session.getMapper(userMapper.class);
        mapper.save(user);
        Mapperutils.close(session);
    }

    //根据id删除
    @Override
    public void deleteByIds(String ids) {
        //获取session对象
        SqlSession session = Mapperutils.getsession();
        //获取映射对象
        userMapper mapper = session.getMapper(userMapper.class);
        //对字符串进行处理
        String[] str= ids.split(",");
        Integer[] idsArray=new Integer[str.length];
        for (int i = 0; i < str.length; i++) {
            idsArray[i]=Integer.parseInt(str[i]);
        }
        mapper.deleteByIds(idsArray);
        Mapperutils.close(session);
    }

    //根据id查找
    @Override
    public User findById(Integer id) {
        //获取session对象
        SqlSession session = Mapperutils.getsession();
        //获取映射对象
        userMapper mapper = session.getMapper(userMapper.class);
        User user = mapper.findById(id);
        return user;
    }
    //修改
    @Override
    public void update(User user) {
        //获取session对象
        SqlSession session = Mapperutils.getsession();
        //获取映射对象
        userMapper mapper = session.getMapper(userMapper.class);
        mapper.update(user);
        session.commit();
/*        Mapperutils.close(session);*/
    }
}
