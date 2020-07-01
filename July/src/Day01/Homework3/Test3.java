package Day01.Homework3;

import java.util.Arrays;

/*
我们可以使用匿名内部类的方式，传递Comparator的子类对象，实现排序。
而Comparator是一个函数式接口，请先使用Lambda表达式改写中间被注释的排序代码，
实现相同的需求。 然后我们还发现，关于两个年龄的比较方法，已经在Student类中实现了，
因此，我们可以直接使用已存在的Student.compareByAge方法，
请继续采用方法引用的方式改写排序代码，实现相同的需求。
 */
class Student {
    private String name;
    private Integer age;

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    // 比较两个学生对象年龄的方法
    public static int compareByAge(Student s1, Student s2) {
        return s1.age.compareTo(s2.age);
    }
}
//假设我们现在有一个Student对象数组，要按照学生的年龄从小到大排序：
public class Test3 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Tom", 20),
                new Student("Jerry", 18),
                new Student("Lily", 19),
                new Student("Lucy", 22),
                new Student("kevin", 21)};
        // 使用匿名内部类
        /*
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getAge().compareTo(s2.getAge());
            }
        });
        */
        // 第一步，使用Lambda表达式改写
        Arrays.sort(students,(s1,s2)->s1.getAge().compareTo(s2.getAge()));
        // 第二步，使用方法引用改写
        Arrays.sort(students,Student::compareByAge);
        // 遍历
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getAge());
        }
    }
}