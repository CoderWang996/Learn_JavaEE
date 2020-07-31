package com.itheima05;

import com.itheima.utils.DataSourceUtils;
import com.itheima05.domain.Student;
import com.itheima05.handler.BeanHandler;
import com.itheima05.handler.BeanListHandler;
import com.itheima05.handler.ScalarHandler;
import org.junit.Test;

import java.util.List;

/*
    模拟dao层
 */
public class JDBCTemplateTest {

    private JDBCTemplate template = new JDBCTemplate(DataSourceUtils.getDataSource());

    @Test
    public void queryForScalar() {
        //查询聚合函数的测试
        String sql = "SELECT COUNT(*) FROM student";
        Long value = template.queryForScalar(sql,new ScalarHandler<Long>());
        System.out.println(value);
    }

    @Test
    public void queryForList() {
        //查询所有学生信息的测试
        String sql = "SELECT * FROM student";
        List<Student> list = template.queryForList(sql, new BeanListHandler<>(Student.class));
        for(Student stu : list) {
            System.out.println(stu);
        }
    }

    @Test
    public void queryForObject() {
        //查询一条记录并封装自定义对象的测试
        String sql = "SELECT * FROM student WHERE sid=?";
        Student stu = template.queryForObject(sql,new BeanHandler<>(Student.class),1);
        System.out.println(stu);
    }

    @Test
    public void delete() {
        //删除数据的测试
        String sql = "DELETE FROM student WHERE name=?";
        int result = template.update(sql, "周七");
        System.out.println(result);
    }

    @Test
    public void update() {
        //修改数据的测试
        String sql = "UPDATE student SET age=? WHERE name=?";
        Object[] params = {37,"周七"};
        int result = template.update(sql, params);
        System.out.println(result);
    }

    @Test
    public void insert() {
        //新增数据的测试
        String sql = "INSERT INTO student VALUES (?,?,?,?)";
        Object[] params = {5,"周七",27,"1997-07-07"};
        int result = template.update(sql, params);
        if(result != 0) {
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }
}
