package com.itheima.mapper.store;

import com.itheima.domain.store.Company;

import java.util.List;

public interface CompanyMapper {
    //查询所有
    List<Company> findAll();

    //新增
    void save(Company company);

    //根据id查询
    Company findByid(String id);

    //修改
    void update(Company company);

    //批量删除
    void deleteByIds(String[] split);

}
