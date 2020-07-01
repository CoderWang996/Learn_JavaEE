package Day01.Homework5;

import java.util.Arrays;

/*
已知的是一个学生实体类Student，和提供不同排序方式的类CompareProvider。
请分别引用这两种排序方式按照注释要求输出相应的结果。
 */
class Student {
    private String name;
    private Integer age;

    public Student(String name, Integer age) {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

// 排序方式提供类
class CompareProvider {
    // 根据姓名比较
    public static int compareByName(Student a, Student b){
        return a.getName().compareTo(b.getName());
    }
    // 根据年龄比较
    public static int compareByAge(Student a, Student b){
        return a.getAge().compareTo(b.getAge());
    }
}

public class Test5 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Tom", 20),
                new Student("Jerry", 18),
                new Student("Lily", 19),
                new Student("Lucy", 22),
                new Student("Kevin", 21)};
        // 使用方法引用，根据姓名比较排序
        Arrays.sort(students,CompareProvider::compareByName);
        // 遍历输出结果
        for (Student student : students) {
            System.out.println(student.getName()+","+student.getAge());
        }
        // 使用方法引用，再根据年龄从小到大排序
        Arrays.sort(students,CompareProvider::compareByAge);
        // 遍历输出结果
        for (Student student : students) {
            System.out.println(student.getName()+","+student.getAge());
        }
    }
}