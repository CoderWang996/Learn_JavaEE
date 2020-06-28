package cn.itcast.Day04.学生管理系统;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.util.ArrayList;
import java.util.Scanner;
/*
学生信息管理系统
 */
public class StudentMS {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Student> arrayList = new ArrayList<>();
        out:while (true) {
            System.out.println("-----欢迎来到学生管理系统-----");
            System.out.println("     1.添加学生");
            System.out.println("     2.删除学生");
            System.out.println("     3.修改学生");
            System.out.println("     4.查看所有学生");
            System.out.println("     5.退出");
            System.out.println("    请输入你的选择");
            int a = cin.nextInt();
            switch (a) {
                case 1:
                    addStudent(arrayList, cin);
                    System.out.println("添加成功！");
                    break;
                case 2:
                    deleteStudent(arrayList, cin);
                    break;
                case 3:
                    updateStudent(arrayList, cin);
                    break;
                case 4:
                    findStudent(arrayList);
                    break;
                case 5:
                    System.out.println("谢谢使用！");
                    break out;
            }
        }
    }

    //修改
    private static void updateStudent(ArrayList<Student> arrayList, Scanner cin) {
        System.out.println("请输入您要修改的学生的学号：");
        String sid = cin.next();
        /*
        for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            if (s.getSid().equals(sid)) {
                System.out.println("请输入姓名：");
                String newName = cin.next();
                System.out.println("请输入年龄：");
                int newAge = cin.nextInt();
                System.out.println("请输入地址：");
                String newAddress = cin.next();
                s.setName(newName);
                s.setAge(newAge);
                s.setAddress(newAddress);
            }
            return;
        }
        System.out.println("您输入的学号有误，请查证后再操作！");
         */
        int index=idISexist(sid,arrayList);
        if(index!=-1){
            Student s = arrayList.get(index);
            System.out.println("请输入姓名：");
            String newName = cin.next();
            System.out.println("请输入年龄：");
            int newAge = cin.nextInt();
            System.out.println("请输入地址：");
            String newAddress = cin.next();
            s.setName(newName);
            s.setAge(newAge);
            s.setAddress(newAddress);
        }
        else {
            System.out.println("您输入的学号有误，请查证后再操作！");
        }
    }

    //删除学生信息
    private static void deleteStudent(ArrayList<Student> arrayList, Scanner cin) {
        System.out.println("请输入要输入要删除的学生的学号：");
        String sid = cin.next();
        /*
         for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            if (s.getSid().equals(sid)) {
                arrayList.remove(i);
                System.out.println("删除成功！");
                return;
            }
        }
        System.out.println("您输入的学号有误，请查证后再操作！");
         */
        int index=idISexist(sid,arrayList);
        if(index!=-1){
            arrayList.remove(index);
            System.out.println("删除成功！");
        }
        else {
            System.out.println("您输入的学号有误，请查证后再操作！");
        }
    }


    //查看学生所有信息
    private static void findStudent(ArrayList<Student> arrayList) {
        //先判断集合是否为空 如果为空。。。。。
        if (arrayList.size() == 0) {
            System.out.println("暂无任何信息，请先添加！");
        } else {
            System.out.println("学号        姓名        年龄        地址");
            for (int i = 0; i < arrayList.size(); i++) {
                Student s = arrayList.get(i);
                System.out.println(s.getSid() + "        " + s.getName() + "       " + s.getAge() + "岁      " + s.getAddress());
            }
        }
    }

    //增加学生信息
    private static void addStudent(ArrayList<Student> arrayList, Scanner cin) {
        System.out.println("请输入学号：");
        String sid;
        while (true) {
            sid = cin.next();
            int index = idISexist(sid, arrayList);
            if (index != -1) {
                System.out.println("学号已存在，请重新输入！");
            }else {
                break;
            }
        }
        System.out.println("请输入姓名：");
        String name = cin.next();
        System.out.println("请输入年龄：");
        int age = cin.nextInt();
        System.out.println("请输入地址：");
        String address = cin.next();
        Student s = new Student(sid, name, age, address);
        arrayList.add(s);
    }


    private static int idISexist(String sid, ArrayList<Student> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            if(s.getSid().equals(sid)){
                return i;
            }
        }
        return -1;
    }
}