package com.itheima.service.system.dept;

import com.itheima.domain.store.Company;
import com.itheima.domain.system.Dept;

import java.util.List;

public interface DeptService {
    //遍历所有
    List<Dept> findAll(String pageNum, String pageSize);

    //不带分页的遍历
    List<Dept> list();

    //新增
    void insert(Dept dept);

    //批量删除
    boolean deleteByids(String ids);

    //根据id查询
    Dept findById(String id);

    //修改
    void update(Dept dept);
}
