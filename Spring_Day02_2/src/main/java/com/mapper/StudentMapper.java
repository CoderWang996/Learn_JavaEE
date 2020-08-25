package com.mapper;

import com.domain.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    @Select("SELECT * FROM student")
    List<Student> findAll();
}
