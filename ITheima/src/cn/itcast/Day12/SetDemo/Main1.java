package cn.itcast.Day12.SetDemo;

import java.util.HashSet;
import java.util.Objects;

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
public class Main1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        HashSet<Student> hs2=new HashSet<>();
        Student s1=new Student("老赵",32);
        Student s2=new Student("小李",21);
        Student s3=new Student("老赵",32);
        hs.add("你好");
        hs.add("Java");
        hs.add("老王");
        hs.add("Java");
        hs2.add(s1);
        hs2.add(s2);
        hs2.add(s3);
        for (String s : hs) {
            System.out.println(s);
            //没有重写hashcode
            System.out.println(s.hashCode());
        }
        for (Student student : hs2) {
            System.out.println(student);
            //重写hashcode
            System.out.println(student.hashCode());
        }
    }
}