package cn.itcast.Day11.Code2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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
        Collection<Student> c=new ArrayList<>();
        Student s1=new Student(20,"小王");
        Student s2=new Student(30,"老刘");
        c.add(s1);
        c.add(s2);
        Iterator it=c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
