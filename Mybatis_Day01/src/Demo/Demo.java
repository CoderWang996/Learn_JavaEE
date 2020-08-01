package Demo;

import domain.student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//测试类
public class Demo {
    private InputStream is;
    private SqlSession session;
    @Before
    public void before() throws Exception{
        //读取配置文件
        is = Resources.getResourceAsStream("sql.xml");
        //构造SqlSessionFactory对象并获取SqlSession对象
        session=new SqlSessionFactoryBuilder().build(is).openSession();
    }
    @After
    public void after() throws Exception{
        //事务提交
        session.commit();
        //释放资源
        session.close();
        is.close();
    }

    /*查看所有学生信息*/
    @Test
    public void findAllTest(){
        List<student> list = session.selectList("one.findAll");
        System.out.println(list);
    }
    /*根据ID查找单个学生*/
    @Test
    public void findByIDTest(){
        student student = session.selectOne("one.findByid",2);
        System.out.println(student);
    }
    /*统计总人数*/
    @Test
    public void findCountTest(){
        Integer integer = session.selectOne("one.findCount");
        System.out.println("总人数"+integer);
    }
    /*统计男女的人员数量*/
    @Test
    public void findsexCount(){
        List<Map> list = session.selectList("findCountBysex");
        for (Map map : list) {
            System.out.println(map);
        }
    }
    /*修改*/
    @Test
    public void updateTest(){
        student student  = session.selectOne("one.findByid", 2);
        student.setAge(32);
        int i = session.update("update", student);
        if (i!=0){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }
    /*通过邮箱和密码进行查询*/
    @Test
    public void update2Test(){
        Map map = new HashMap();
        map.put("email","111@168.com");
        map.put("password",666);
        student student = session.selectOne("findByEandpwd", map);
        System.out.println(student);
    }
    /*根据学生姓名模糊查询*/
    @Test
    public void findLikenameTest(){
/*        student student = session.selectOne("findLikename", "%庄%");
        System.out.println(student);*/
        List<student> list = session.selectList("findLikename", "%庄%");
        System.out.println(list);
    }
    /*获取保存后主键列的值*/
    @Test
    public void saveTest(){
        student student = new student(null, "孙悟空", 30, "188@qq.com", 555, "男");
        System.out.println("执行前"+student);
        session.insert("save",student);
        System.out.println("执行后"+student);
    }
    /*根据id删除*/
    @Test
    public void deleteTest(){
        int i = session.delete("deleteByid", 5);
        if (i!=0){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }

    }
}
