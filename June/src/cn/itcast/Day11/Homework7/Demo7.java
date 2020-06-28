package cn.itcast.Day11.Homework7;

import com.sun.deploy.ui.DialogTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
【编号：1407】在某次比赛中，共有8位评委，采用百分制。
去除一个最低分和一个最高分，其余的平均得分即为选手的最终得分。
请编写程序，使用所学集合知识，
计算选手的得分，评分分数由键盘录入。 运行效果如下：
请录入第1个评委成绩：
100
请录入第2个评委成绩：
95
请录入第3个评委成绩：
95
请录入第4个评委成绩：
90
请录入第5个评委成绩：
90
请录入第6个评委成绩：
80
请录入第7个评委成绩：
85
请录入第8个评委成绩：
90
选手最终得分为：90.83333333333333
 */
public class Demo7 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<>();
        System.out.println("请录入第1个评委成绩：");
        a.add(cin.nextInt());
        System.out.println("请录入第2个评委成绩：");
        a.add(cin.nextInt());
        System.out.println("请录入第3个评委成绩：");
        a.add(cin.nextInt());
        System.out.println("请录入第4个评委成绩：");
        a.add(cin.nextInt());
        System.out.println("请录入第5个评委成绩：");
        a.add(cin.nextInt());
        System.out.println("请录入第6个评委成绩：");
        a.add(cin.nextInt());
        System.out.println("请录入第7个评委成绩：");
        a.add(cin.nextInt());
        System.out.println("请录入第8个评委成绩：");
        a.add(cin.nextInt());
        int sum=0;
        int []arr=new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            arr[i]=a.get(i);
        }
        Arrays.sort(arr);
        ArrayList<Integer> a2=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            a2.add(arr[i]);
        }

        for (int i = 1; i <a2.size()-1; i++) {
            sum+=a2.get(i);
        }
        System.out.println(sum/6.0);
    }
}
