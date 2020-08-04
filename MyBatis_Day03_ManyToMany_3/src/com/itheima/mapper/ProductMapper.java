package com.itheima.mapper;

import com.itheima.domain.product;
import org.apache.ibatis.annotations.Select;

public interface ProductMapper {
    //根据uid查询product表
    @Select("SELECT * FROM product p , us_pro up where p.id=up.pid AND up.uid=#{uid}")
    product findByUid(Integer uid);
}
