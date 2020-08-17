package com.itheima.service.system.dept;

import com.github.pagehelper.PageHelper;
import com.itheima.domain.system.Dept;
import com.itheima.mapper.system.DeptMapper;
import com.itheima.utils.MapperUtils;
import com.mysql.jdbc.StringUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class DeptServiceImpl implements DeptService {
    //遍历所有
    @Override
    public List<Dept> findAll(String pageNum, String pageSize) {
        SqlSession session =null;
        try {
            //获取Sqlsession对象
            session = MapperUtils.getsession();
            //获取代理对象
            DeptMapper mapper = session.getMapper(DeptMapper.class);
            //设置默认首页
            int currentPage=1;
            //设置默认每页显示条数
            int ps=5;
            //如果获取到的数据不为空字符串并且有值则赋值
            if (!StringUtils.isNullOrEmpty(pageNum)){
                currentPage=Integer.parseInt(pageNum);
            }
            if (!StringUtils.isNullOrEmpty(pageSize)){
                ps=Integer.parseInt(pageSize);
            }
            //设置分页参数
            PageHelper.startPage(currentPage,ps);
            //执行Sql语句
            List<Dept> list = mapper.findAll();
            //返回结果
            return list;
        }catch (Exception e){
            throw new RuntimeException("查询失败！");
        }finally {
            //提交事务并释放资源
            MapperUtils.close(session);
        }
    }

    //不带分页的遍历
    @Override
    public List<Dept> list() {
        //获取Sqlsession对象
        SqlSession session = MapperUtils.getsession();
        //获取代理对象
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        //执行sql语句
        List<Dept> list = mapper.findAll();
        //提交事务释放资源
        MapperUtils.close(session);
        //返回查询结果
        return list;
    }

    //新增
    @Override
    public void insert(Dept dept) {
        //获取Sqlsession对象
        SqlSession session = MapperUtils.getsession();
        //获取代理对象
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        //执行sql语句
        mapper.insert(dept);
        //提交事务释放资源
        MapperUtils.close(session);
    }

    //批量删除
    @Override
    public boolean deleteByids(String ids) {
        SqlSession session=null;
        boolean flag=false;//默认删除失败
        try {
            //获取session对象
            session=MapperUtils.getsession();
            //获取代理对象
            DeptMapper mapper = session.getMapper(DeptMapper.class);
            //处理lds
            String[] Ids = ids.split(",");
            //执行sql语句
            mapper.deleteByids(Ids);
            //执行到这里说明删除成功
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //提交事务释放资源
            MapperUtils.close(session);
        }
        return flag;
    }

    //根据id查询
    @Override
    public Dept findById(String id) {
        //获取Sqlsession对象
        SqlSession session = MapperUtils.getsession();
        //获取代理对象
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        //执行sql语句
        Dept dept = mapper.findById(id);
        //提交事务释放资源
        MapperUtils.close(session);
        //返回查询结果
        return dept;
    }

    @Override
    public void update(Dept dept) {
        //获取Sqlsession对象
        SqlSession session = MapperUtils.getsession();
        //获取代理对象
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        //执行sql语句
        mapper.update(dept);
        //提交事务释放资源
        MapperUtils.close(session);
    }
}
