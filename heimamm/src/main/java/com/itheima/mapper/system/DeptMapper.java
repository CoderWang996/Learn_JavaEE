package com.itheima.mapper.system;

import com.itheima.domain.system.Dept;

import java.util.List;

public interface DeptMapper {
    //遍历所有
    List<Dept> findAll();

    //新增
    void insert(Dept dept);

    //批量删除
    void deleteByids(String[] ids);

    //根据id查询
    Dept findById(String id);

    //修改
    void update(Dept dept);
}
