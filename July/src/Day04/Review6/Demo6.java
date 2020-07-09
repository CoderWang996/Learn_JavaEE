package Day04.Review6;

import java.util.Comparator;
import java.util.TreeSet;

/*
案例需求
- 用TreeSet集合存储多个学生信息(姓名，语文成绩，数学成绩)，并遍历该集合
- 要求：按照总分从高到低出现
 */
class Student{
    private String Name;
    private int Chinese;
    private int Math;

    public Student() {
    }

    public Student(String name, int chinese, int math) {
        Name = name;
        Chinese = chinese;
        Math = math;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }
    public int sum(){
        return this.Chinese+this.Math;
    }
}
public class Demo6 {
    public static void main(String[] args) {
        Student s1=new Student("老王",80,100);
        Student s2=new Student("小李",90,60);
        Student s3=new Student("老赵",90,90);
        TreeSet<Student> ts=new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num1=s2.sum()-s1.sum();
                int num2=num1==0?s2.getChinese()-s1.getChinese():num1;
                int num3=num2==0?s2.getMath()-s1.getMath():num2;
                return num3;
            }
        });
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        for (Student t : ts) {
            System.out.println(t.getName()+"的总分是："+t.sum()+"语文成绩："+t.getChinese()+"数学成绩："+t.getMath());
        }
    }
}
