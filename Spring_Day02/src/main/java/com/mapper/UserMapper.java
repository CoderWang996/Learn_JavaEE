package com.mapper;

import com.domain.User;

import java.util.List;

public interface UserMapper {
    //查询所有
    List<User> findAll();
}
