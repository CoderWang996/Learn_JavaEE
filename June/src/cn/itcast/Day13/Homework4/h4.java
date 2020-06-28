package JUNE.src.cn.itcast.Day13.Homework4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
【编号：1604】现需要将一些学生对象（属性包含姓名和年龄），
与其地址，一一对应存储，并查看存储效果，
要保证学生对象不重复，请编写程序实现以上需求，运行效果如下：
Student{name='小红', age=20}---北京海淀
Student{name='小黄', age=22}---北京朝阳
Student{name='小白', age=25}---北京海淀
Student{name='小蓝', age=23}---北京顺义
Student{name='小绿', age=21}---北京昌平
 */
class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class h4 {
    public static void main(String[] args) {
        HashMap<Student,String> HM=new HashMap<>();
        Student s1=new Student("小红",20);
        Student s2=new Student("小黄",22);
        Student s3=new Student("小白",25);
        Student s4=new Student("小蓝",23);
        Student s5=new Student("小绿",21);
        HM.put(s1,"北京海淀");
        HM.put(s2,"北京朝阳");
        HM.put(s3,"北京海淀");
        HM.put(s4,"北京顺义");
        HM.put(s5,"北京昌平");
        Set<Map.Entry<Student, String>> entries = HM.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }
    }
}
