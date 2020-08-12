package com.itheima.service.iml;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.Utils.Mapperutils;
import com.itheima.domain.Student;
import com.itheima.mapper.StudentMapper;
import com.itheima.service.StudentService;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentServiceIml implements StudentService {
    //分页查询
    @Override
    public Page selectByPage(int currenPage, int pageSize) {
        //获取Sqlsession对象
        SqlSession session = Mapperutils.getsession();
        //获取代理对象
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        //设置分页参数
        Page page = PageHelper.startPage(currenPage, pageSize);
        //执行sql语句
        mapper.selectAll();
        //释放资源
        Mapperutils.close(session);
        //返回结果到控制层
        return page;

    }

    //添加学生功能
    @Override
    public void addStu(Student student) {
        //获取Sqlsession对象
        SqlSession session = Mapperutils.getsession();
        //获取代理对象
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        //执行sql语句
        mapper.addStu(student);
        //释放资源
        Mapperutils.close(session);
    }

    //修改学生信息
    @Override
    public void update(Student stu) {
        //获取Sqlsession对象
        SqlSession session = Mapperutils.getsession();
        //获取代理对象
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        //执行sql语句
        mapper.update(stu);
        //释放资源
        Mapperutils.close(session);
    }

    //删除功能
    @Override
    public void deleteStu(String number) {
        //获取Sqlsession对象
        SqlSession session = Mapperutils.getsession();
        //获取代理对象
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        //执行sql语句
        mapper.deleteStu(number);
        //释放资源
        Mapperutils.close(session);
    }
}
