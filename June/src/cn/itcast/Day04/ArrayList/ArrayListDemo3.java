package cn.itcast.Day04.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

//创建ArrayList对象
public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Student> array=new ArrayList<>();
        addStudent(array);
        addStudent(array);
        addStudent(array);
        for (int i = 0; i < array.size(); i++) {
            Student s=array.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
    }
    private static void addStudent(ArrayList<Student> array) {
        Scanner cin=new Scanner(System.in);
        System.out.println("请输入姓名");
        String name=cin.next();
        System.out.println("请输入年龄");
        int age=cin.nextInt();
        Student s=new Student(name,age);
        array.add(s);
    }
}