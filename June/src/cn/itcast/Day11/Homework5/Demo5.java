package cn.itcast.Day11.Homework5;

import java.util.ArrayList;
import java.util.Collection;
/*
【编号：1405】为方便管理，现需要将班级中学员的信息（学号、姓名、年龄）
存储起来。请使用所学集合知识将信息遍历打印。请使用foreach语句完成集合的遍历，效果如下：
 */
class Student{
    private String sid;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String sid, String name, int age) {
        this.sid = sid;
        this.name = name;
        this.age = age;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Demo5 {
    public static void main(String[] args) {
        ArrayList<Student> c=new ArrayList<>();
        /*
        姓名：吕布，学号：001，年龄：18
        姓名：赵云，学号：002，年龄：19
        姓名：典韦，学号：003，年龄：20
         */
        Student s1=new Student("001","吕布",18);
        Student s2=new Student("002","赵云",19);
        Student s3=new Student("003","典韦",20);
        c.add(s1);
        c.add(s2);
        c.add(s3);
        for (Student student : c) {
            System.out.println("姓名："+student.getName()+"学号："+student.getSid()+"年龄："+student.getAge());
        }
    }
}
