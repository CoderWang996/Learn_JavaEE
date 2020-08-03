package com.itheima.mapper;

import com.itheima.domain.Orderlist;

import java.util.List;

public interface OrderMapper {
    //查找订单编号和其对应的用户姓名与年龄
    List<Orderlist> findOrderAndUser();
}
