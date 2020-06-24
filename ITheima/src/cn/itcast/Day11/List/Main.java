package cn.itcast.Day11.List;

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
        List<Student> l=new ArrayList<>();
        Student s1=new Student(20,"小王");
        Student s2=new Student(30,"老刘");
        l.add(s1);
        l.add(s2);
        Iterator<Student> IT=l.iterator();
        while (IT.hasNext()){
            Student s= IT.next();
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("for遍历");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i).getName()+","+l.get(i).getAge());
        }
    }
}
