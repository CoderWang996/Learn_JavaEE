package cn.itcast.Day17.Homework8;

import java.io.*;
import java.util.ArrayList;

/*
【编号：1808】在当前模块目录下，有一个“maths.txt”文件（直接准备好即可），其中的文本内容如下：
5+5
10-5
2*3
20/4
...
每行一个算术表达式，每个式子都是使用加减乘除符号连接的两个数字，没有其他数据。
 请编写程序将每个式子的结果计算出来，再写回这个文件中。程序执行后，文件中的内容为：
5+5=10
10-5=5
2*3=6
20/4=5
 */
public class Test8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("ITheima\\maths.txt"));
        ArrayList<String> list=new ArrayList<>();
        String line;
        while ((line=br.readLine())!=null){
            list.add(line);
        }
        br.close();
        BufferedWriter bw=new BufferedWriter(new FileWriter("ITheima\\maths.txt"));
        for (String s : list) {
            if(s.contains("+")){
                String front=s.substring(0,s.indexOf("+"));
                String end=s.substring(s.indexOf("+")+1);
                int a=Integer.parseInt(front);
                int b=Integer.parseInt(end);
                int sum=a+b;
                String ns="a"+"+"+"b"+"="+sum;
                bw.write(ns);
                bw.newLine();
                bw.flush();
            }
            else if (s.contains("-")){
                String front=s.substring(0,s.indexOf("-"));
                String end=s.substring(s.indexOf("-")+1);
                int a=Integer.parseInt(front);
                int b=Integer.parseInt(end);
                int sub=a-b;
                String ns="a"+"-"+"b"+"="+sub;
                bw.write(ns);
                bw.newLine();
                bw.flush();
            }
            else if (s.contains("*")){
                String front=s.substring(0,s.indexOf("*"));
                String end=s.substring(s.indexOf("*")+1);
                int a=Integer.parseInt(front);
                int b=Integer.parseInt(end);
                int mul=a*b;
                String ns="a"+"-"+"b"+"="+mul;
                bw.write(ns);
                bw.newLine();
                bw.flush();
            }
            else if (s.contains("/")){
                String front=s.substring(0,s.indexOf("/"));
                String end=s.substring(s.indexOf("/")+1);
                int a=Integer.parseInt(front);
                int b=Integer.parseInt(end);
                int div=a/b;
                String ns="a"+"/"+"b"+"="+div;
                bw.write(ns);
                bw.newLine();
                bw.flush();
            }
        }
        bw.close();
       }
}