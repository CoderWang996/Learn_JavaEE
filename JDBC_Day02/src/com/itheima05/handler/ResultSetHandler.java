package com.itheima05.handler;

import java.sql.ResultSet;
/*
    用于处理结果集方式的接口
 */
public interface ResultSetHandler<T> {
    <T> T handler(ResultSet rs);
}
