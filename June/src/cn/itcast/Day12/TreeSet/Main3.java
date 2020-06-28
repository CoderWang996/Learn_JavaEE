package cn.itcast.Day12.TreeSet;

import java.util.TreeSet;

class Student implements Comparable<Student> {
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
    public int compareTo(Student s) {
        int num=this.age-s.age;
        int num2=num==0?this.name.compareTo(s.name):num;
        return num2;
    }
}
public class Main3 {
    public static void main(String[] args) {
        TreeSet<Student> ts=new TreeSet<>();
        Student s1=new Student("老赵",32);
        Student s2=new Student("小李",21);
        Student s3=new Student("老赵",30);
        Student s4=new Student("老赵",32);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        for (Student t : ts) {
            System.out.println(t.getName()+","+t.getAge());
        }
}
}