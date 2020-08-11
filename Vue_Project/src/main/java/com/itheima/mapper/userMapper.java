package com.itheima.mapper;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface userMapper {
    //查询所有
    @Select("SELECT * FROM `user`")
    List<User> findAll();
    //新增
    @Insert("INSERT INTO `user` VALUES (id,#{age},#{username},#{password},#{email},#{sex})")
    void save(User user);
    //批量删除
    void deleteByIds(Integer[] idsArray);

    //根据id查询
    @Select("SELECT * FROM `user` WHERE id=#{id}")
    User findById(Integer id);

    //修改
    void update(User user);
}
