package cn.itcast.Day04.作业一;

import java.util.ArrayList;
import java.util.Scanner;

/*
### 第一题

请定义教师（Teacher）类，属性包含姓名和专业名称。将若干教师对象存入ArrayList集合中，并遍历集合打印教师信息，格式如下：

```text
姓名：赵老师, 专业：javase 姓名：钱老师, 专业：javaee 姓名：孙老师, 专业：php 姓名：李老师, 专业：python
``
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Teacher> arrayList=new ArrayList<>();
        Scanner cin=new Scanner(System.in);
        System.out.println("请输入你要录入老师的个数：");
        int n=cin.nextInt();
        while (n-->0){
            addTeacher(arrayList);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("姓名： "+arrayList.get(i).getName()+" 专业： "+arrayList.get(i).getMaior());
        }
    }

    private static void addTeacher(ArrayList<Teacher> arrayList) {
        Scanner cin=new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name=cin.next();
        System.out.println("请输入专业：");
        String major=cin.next();
        Teacher teacher=new Teacher(name,major);
        arrayList.add(teacher);
    }
}