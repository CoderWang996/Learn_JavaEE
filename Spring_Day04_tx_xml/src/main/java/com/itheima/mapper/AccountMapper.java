package com.itheima.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface AccountMapper {
    //转出操作
    @Update("update account set money=money-#{money} where name=#{name}")
    void outUpdate(@Param("name") String name, @Param("money") Double money);
    //转入操作
    @Update("update account set money=money+#{money} where name=#{name}")
    void inUpdate(@Param("name") String name, @Param("money") Double money);
}
