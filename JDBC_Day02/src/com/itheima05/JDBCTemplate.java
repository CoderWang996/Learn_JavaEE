package com.itheima05;

import com.itheima.utils.DataSourceUtils;
import com.itheima05.handler.ResultSetHandler;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
    JDBC框架类
 */
public class JDBCTemplate {
    //1.定义参数变量(数据源、连接对象、执行者对象、结果集对象)
    private DataSource dataSource;
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;

    //2.通过有参构造为数据源赋值
    public JDBCTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /*
        查询方法：用于将聚合函数的查询结果进行返回
     */
    public Long queryForScalar(String sql, ResultSetHandler<Long> rsh, Object...objs){
        Long value = null;

        try{
            //通过数据源获取一个数据库连接
            con = dataSource.getConnection();

            //通过数据库连接对象获取执行者对象，并对sql语句进行预编译
            pst = con.prepareStatement(sql);

            //通过执行者对象获取参数的源信息对象
            ParameterMetaData parameterMetaData = pst.getParameterMetaData();
            //通过参数源信息对象获取参数的个数
            int count = parameterMetaData.getParameterCount();

            //判断参数数量是否一致
            if(count != objs.length) {
                throw new RuntimeException("参数个数不匹配");
            }

            //为sql语句占位符赋值
            for(int i = 0; i < objs.length; i++) {
                pst.setObject(i+1,objs[i]);
            }

            //执行sql语句并接收结果
            rs = pst.executeQuery();

            //通过ScalarHandler方式对结果进行处理
            value = rsh.handler(rs);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //释放资源
            DataSourceUtils.close(con,pst,rs);
        }

        //返回结果
        return value;
    }

    /*
        查询方法：用于将多条记录封装成自定义对象并添加到集合返回
     */
    public <T> List<T> queryForList(String sql, ResultSetHandler<T> rsh, Object...objs){
        List<T> list = new ArrayList<>();

        try{
            //通过数据源获取一个数据库连接
            con = dataSource.getConnection();

            //通过数据库连接对象获取执行者对象，并对sql语句进行预编译
            pst = con.prepareStatement(sql);

            //通过执行者对象获取参数的源信息对象
            ParameterMetaData parameterMetaData = pst.getParameterMetaData();
            //通过参数源信息对象获取参数的个数
            int count = parameterMetaData.getParameterCount();

            //判断参数数量是否一致
            if(count != objs.length) {
                throw new RuntimeException("参数个数不匹配");
            }

            //为sql语句占位符赋值
            for(int i = 0; i < objs.length; i++) {
                pst.setObject(i+1,objs[i]);
            }

            //执行sql语句并接收结果
            rs = pst.executeQuery();

            //通过BeanListHandler方式对结果进行处理
            list = rsh.handler(rs);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //释放资源
            DataSourceUtils.close(con,pst,rs);
        }

        //返回结果
        return list;
    }

    /*
        查询方法：用于将一条记录封装成自定义对象并返回
     */
    public <T> T queryForObject(String sql, ResultSetHandler<T> rsh,Object...objs){
        T obj = null;

        try{
            //通过数据源获取一个数据库连接
            con = dataSource.getConnection();

            //通过数据库连接对象获取执行者对象，并对sql语句进行预编译
            pst = con.prepareStatement(sql);

            //通过执行者对象获取参数的源信息对象
            ParameterMetaData parameterMetaData = pst.getParameterMetaData();
            //通过参数源信息对象获取参数的个数
            int count = parameterMetaData.getParameterCount();

            //判断参数数量是否一致
            if(count != objs.length) {
                throw new RuntimeException("参数个数不匹配");
            }

            //为sql语句占位符赋值
            for(int i = 0; i < objs.length; i++) {
                pst.setObject(i+1,objs[i]);
            }

            //执行sql语句并接收结果
            rs = pst.executeQuery();

            //通过BeanHandler方式对结果进行处理
            obj = rsh.handler(rs);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //释放资源
            DataSourceUtils.close(con,pst,rs);
        }

        //返回结果
        return obj;
    }

    /*
        用于执行增删改功能的方法
     */
    //3.定义update方法。参数：sql语句、sql语句中的参数
    public int update(String sql,Object...objs) {
        //4.定义int类型变量，用于接收增删改后影响的行数
        int result = 0;

        try{
            //5.通过数据源获取一个数据库连接
            con = dataSource.getConnection();

            //6.通过数据库连接对象获取执行者对象，并对sql语句进行预编译
            pst = con.prepareStatement(sql);

            //7.通过执行者对象获取参数的源信息对象
            ParameterMetaData parameterMetaData = pst.getParameterMetaData();
            //8.通过参数源信息对象获取参数的个数
            int count = parameterMetaData.getParameterCount();

            //9.判断参数数量是否一致
            if(count != objs.length) {
                throw new RuntimeException("参数个数不匹配");
            }

            //10.为sql语句占位符赋值
            for(int i = 0; i < objs.length; i++) {
                pst.setObject(i+1,objs[i]);
            }

            //11.执行sql语句并接收结果
            result = pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //12.释放资源
            DataSourceUtils.close(con,pst);
        }

        //13.返回结果
        return result;
    }
}
