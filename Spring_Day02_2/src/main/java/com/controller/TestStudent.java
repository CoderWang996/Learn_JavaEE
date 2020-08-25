package com.controller;

import com.config.SpringConfig;
import com.domain.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.service.StudentService;

import java.util.List;
//测试类
public class TestStudent {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        StudentService bean = ac.getBean(StudentService.class);
        List<Student> students = bean.findAll();
        System.out.println(students);
    }
}
