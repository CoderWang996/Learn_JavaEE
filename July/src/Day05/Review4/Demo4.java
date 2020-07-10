package Day05.Review4;

import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

/*
- 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩)。要求按照成绩总分从高到低写入文本文件
- 格式：姓名,语文成绩,数学成绩,英语成绩  举例：林青霞,98,99,100
 */
class Student implements Comparable<Student>{
    private String name;
    private int Chinese;
    private int Math;
    private int English;

    public Student() {
    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        Chinese = chinese;
        Math = math;
        English = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int Sum(){
        return this.Chinese+this.Math+this.English;
    }
    @Override
    public String toString() {
        return name+","+Chinese+","+Math+","+English;
    }

    @Override
    public int compareTo(Student student) {
        int num=student.Sum()-this.Sum();
        return num==0?-1:num;
    }
}
public class Demo4 {
    public static void main(String[] args) throws IOException {
        Scanner cin=new Scanner(System.in);
        TreeSet<Student> ts=new TreeSet<>();
        System.out.println("请录入第一个学生的信息：");
        System.out.println("请录入姓名：");
        String name1=cin.next();
        System.out.println("请录入语文成绩：");
        int c1=cin.nextInt();
        System.out.println("请录入数学成绩：");
        int m1=cin.nextInt();
        System.out.println("请录入英语成绩：");
        int e1=cin.nextInt();
        System.out.println("请录入第二个学生的信息：");
        System.out.println("请录入姓名：");
        String name2=cin.next();
        System.out.println("请录入语文成绩：");
        int c2=cin.nextInt();
        System.out.println("请录入数学成绩：");
        int m2=cin.nextInt();
        System.out.println("请录入英语成绩：");
        int e2=cin.nextInt();
        System.out.println("请录入第三个学生的信息：");
        System.out.println("请录入姓名：");
        String name3=cin.next();
        System.out.println("请录入语文成绩：");
        int c3=cin.nextInt();
        System.out.println("请录入数学成绩：");
        int m3=cin.nextInt();
        System.out.println("请录入英语成绩：");
        int e3=cin.nextInt();
        Student s1=new Student(name1,c1,m1,e1);
        Student s2=new Student(name2,c2,m2,e2);
        Student s3=new Student(name3,c3,m3,e3);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        BufferedWriter bw=new BufferedWriter(new FileWriter("July\\Students.txt"));
        for (Student t : ts) {
            bw.write(t.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
        System.out.println("文件写入成功！");
        System.out.println("文件里的内容是：");
        BufferedReader br=new BufferedReader(new FileReader("July\\Students.txt"));
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
}
