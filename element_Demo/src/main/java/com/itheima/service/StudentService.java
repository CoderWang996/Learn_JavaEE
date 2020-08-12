package com.itheima.service;

import com.github.pagehelper.Page;
import com.itheima.domain.Student;

public interface StudentService {
    //分页查询
    Page selectByPage(int currenPage, int pageSize);
    //添加学生功能
    void addStu(Student student);
    //修改学生信息
    void update(Student stu);
    //删除功能
    void deleteStu(String number);
}
