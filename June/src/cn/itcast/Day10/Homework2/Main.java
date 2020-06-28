package cn.itcast.Day10.Homework2;
/*
【编号：1302】现获取到用户填写的3个年龄信息，但格式是以逗号分隔的字符串形式，
例如："23,24,25"（直接定义字符串给出即可）。现需要求出这三个年龄的平均年龄，请编写程序实现，并将结果打印到控制台。 运行结果：
平均年龄为：24
 */
public class Main {
    public static void main(String[] args) {
        String s ="23,24,25";
        String []a=s.split(",");
        int []arr=new int[a.length];
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            arr[i]=Integer.parseInt(a[i]);
            sum+=arr[i];
        }
        System.out.println(sum/3);

    }
}