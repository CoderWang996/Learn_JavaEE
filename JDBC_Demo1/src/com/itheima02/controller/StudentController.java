package com.itheima02.controller;

import com.itheima02.domain.Student;
import com.itheima02.service.StudentService;
import com.itheima02.service.StudentServiceImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

public class StudentController {
    private StudentService service = new StudentServiceImpl();
    /*
        查询所有学生信息
     */
    @Test
    public void findAll() {
        ArrayList<Student> list = service.findAll();
        for(Student stu : list) {
            System.out.println(stu);
        }
    }

    /*
        条件查询，根据id查询学生信息
     */
    @Test
    public void findById() {
        Student stu = service.findById(3);
        System.out.println(stu);
    }

    /*
        添加学生信息
     */
    @Test
    public void insert() {
        Student stu = new Student(5,"周七",27,new Date());
        int result = service.insert(stu);

        if(result!=0) {
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }

    /*
        修改学生信息
     */
    @Test
    public void update() {
        Student stu = service.findById(5);
        stu.setName("周七七");

        int result = service.update(stu);

        if(result != 0) {
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }

    /*
        删除学生信息
     */
    @Test
    public void delete() {
        int result = service.delete(5);

        if(result != 0) {
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }
}
