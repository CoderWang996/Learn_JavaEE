package com.itheima.mapper;

import com.itheima.domain.Items;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ItemsMapper {
    @Select("SELECT items.* FROM `user` LEFT JOIN orders ON orders.user_id = `user`.id LEFT JOIN orderdetail ON orderdetail.orders_id = orders.id LEFT JOIN items ON orderdetail.items_id = items.id WHERE `user`.id =#{id}")
    List<Items> findById(int id);
}
