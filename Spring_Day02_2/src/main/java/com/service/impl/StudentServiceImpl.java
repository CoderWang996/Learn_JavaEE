package com.service.impl;

import com.domain.Student;
import com.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.service.StudentService;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    //注入mapper
    @Autowired
    private StudentMapper studentMapper;
    public List<Student> findAll() {
        return studentMapper.findAll();
    }
}
