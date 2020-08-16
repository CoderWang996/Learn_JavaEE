package com.itheima.mapper;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {
    //查询所有
    @Select("SELECT * FROM user")
    List<User> findAll();
    //新增
    @Insert("INSERT into `user` VALUES (#{id},#{username},#{email})")
    void insert(User user);
    //修改
    @Update("UPDATE `user` SET username=#{username},email=#{email} WHERE id=#{id}")
    void update(User user);
    //删除
    @Delete("DELETE FROM `user` WHERE id=#{id}")
    void delete(int id);
}
