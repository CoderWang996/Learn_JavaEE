package com.itheima.mapper;


import com.itheima.domain.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentMapper {
    //分页查询
    @Select("select * from student")
    List<Student> selectAll();

    //添加学生信息
    @Insert("INSERT INTO student VALUES(#{number},#{name},#{birthday},#{address})")
    void addStu(Student student);

    //修改学生信息
    @Update("UPDATE student SET number=#{number},`name`=#{name},birthday=#{birthday},address=#{address} WHERE number=#{number}")
    void update(Student stu);

    //根据学号删除
    @Delete("DELETE FROM student WHERE number=#{number}")
    void deleteStu(String number);
}
