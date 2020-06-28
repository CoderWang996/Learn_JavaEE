package JUNE.src.cn.itcast.Day12.Homework6;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
【编号：1506】在某次考试中，学生的成绩信息如下：
 姓名 年龄 成绩 Tom 20 90 Jerry 22 95 John 20 100 Lily 22 100 Lucy 22 90 Kevin 22 90
 请分别用Comparable和Comparator两个接口对以上同学的成绩做降序排序，
如果成绩一样，那在成绩排序的基础上按照年龄由小到大排序，成绩和年龄都一样，则按照姓名的字典顺序排序。
 */
class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int score;

    public Student() {
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        int num=o.getScore()-this.getScore();
        int num2=num==0?this.age-o.age:num;
        int num3=num2==0?this.name.compareTo(o.name):num2;
        return num3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
public class Demo6 {
    public static void main(String[] args) {
        Set<Student> set=new TreeSet<>();
        Set<Student> set2=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num=o2.getScore()-o1.getScore();
                int num2=num==0?o1.getAge()-o1.getAge():num;
                int num3=num2==0?o1.getName().compareTo(o2.getName()):num2;
                return num3;
            }
        });
        // 姓名 年龄 成绩 Tom 20 90 Jerry 22 95 John 20 100 Lily 22 100 Lucy 22 90 Kevin 22 90
        Student s1=new Student("Tom",20,90);
        Student s2=new Student("Jerry",22,95);
        Student s3=new Student("John",20,100);
        Student s4=new Student("Lily",22,100);
        Student s5=new Student("Lucy",22,90);
        Student s6=new Student("Kevin",22,90);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.add(s6);
        set2.add(s1);
        set2.add(s2);
        set2.add(s3);
        set2.add(s4);
        set2.add(s5);
        set2.add(s6);
        System.out.println("Comparable:");;
        for (Student student : set) {
            System.out.println(student);
        }
        System.out.println("==========");
        System.out.println("Comparator:");
        for (Student student : set2) {
            System.out.println(student);
        }
    }
}
