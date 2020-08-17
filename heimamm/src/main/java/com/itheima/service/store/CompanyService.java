package com.itheima.service.store;

import com.itheima.domain.store.Company;

import java.util.List;

public interface CompanyService {
    //查询所有
    List<Company> findAll(String pageNum, String pageSize);

    //新增
    void save(Company company);

    //根据id查询
    Company findByid(String id);

    //修改
    void update(Company company);

    //批量删除
    boolean deleteByIds(String ids);

}
