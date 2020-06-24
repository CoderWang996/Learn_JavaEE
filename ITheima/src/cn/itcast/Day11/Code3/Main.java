package cn.itcast.Day11.Code3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student<toString> {
    private  int  age;
    private  String name;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<Student>();
        Student s1=new Student(20,"小王");
        Student s2=new Student(30,"老刘");
        list.add(s1);
        list.add(s2);
        System.out.println("=========================");
        System.out.println("迭代法：");
        Iterator<Student> it=list.iterator();
        while (it.hasNext()){
            Student s=it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("=========================");
        System.out.println("普通FOR");
        for (int i = 0; i < list.size(); i++) {
            Student s=list.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("=========================");
        System.out.println("增强FOR");
        for (Student student : list) {
            System.out.println(student.getName()+","+student.getAge());
        }
    }
}
