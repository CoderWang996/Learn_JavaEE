package com.itheima.provider.dao;

import com.itheima.provider.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductDao {
    @Select("select * from product")
    public List<Product> findAll();
    @Select("select * from product where id='676C5BD1D35E429A8C2E114939C5685A'")
    Product findById();
}
