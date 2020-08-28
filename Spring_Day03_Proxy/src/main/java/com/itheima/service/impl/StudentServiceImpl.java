package com.itheima.service.impl;

import com.itheima.service.StudentService;
//目标对象
public class StudentServiceImpl implements StudentService {
    public void save() {
        System.out.println("Saving......");
    }

    public void findAll() {
        System.out.println("Finding......");
    }

    public void update(int id) {
        System.out.println("Updating......");
    }
}
