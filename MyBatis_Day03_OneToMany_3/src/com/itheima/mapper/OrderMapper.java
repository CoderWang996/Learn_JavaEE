package com.itheima.mapper;

import com.itheima.domain.Orderlist;
import org.apache.ibatis.annotations.Select;

public interface OrderMapper {
    //根据uid查找订单
    @Select("SELECT * FROM orderlist WHERE uid=#{uid}")
    Orderlist findByUid();
}
