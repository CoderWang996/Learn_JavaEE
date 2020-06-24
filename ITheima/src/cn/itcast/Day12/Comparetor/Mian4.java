package cn.itcast.Day12.Comparetor;

import java.util.Comparator;
import java.util.TreeSet;

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

}
public class Mian4 {
    public static void main(String[] args){
        TreeSet<Student> ts=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num=s1.getAge()-s2.getAge();
                int num2=(num==0)?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });
        Student s1=new Student("Ading",32);
        Student s2=new Student("Tom",21);
        Student s3=new Student("Jarry",32);
        Student s4=new Student("Tom",21);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        for (Student t : ts) {
            System.out.println(t.getName()+","+t.getAge());
        }
    }
}
