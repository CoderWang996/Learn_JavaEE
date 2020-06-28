package cn.itcast.Day16.Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

/*
- 案例需求
  - 实现猜数字小游戏只能试玩3次，如果还想玩，提示：游戏试玩已结束，想玩请充值(www.itcast.cn)
- 分析步骤
  1. 写一个游戏类，里面有一个猜数字的小游戏
  2. 写一个测试类，测试类中有main()方法，main()方法中写如下代码：
     ​	从文件中读取数据到Properties集合，用load()方法实现
       		文件已经存在：game.txt
       		里面有一个数据值：count=0
     ​	通过Properties集合获取到玩游戏的次数
     ​	判断次数是否到到3次了
       		如果到了，给出提示：游戏试玩已结束，想玩请充值(www.itcast.cn)
       		如果不到3次：
       		次数+1，重新写回文件，用Properties的store()方法实现玩游戏
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        //从文件中读取数据到Properties集合，用load()方法实现
        Properties prop=new Properties();
        FileReader fr=new FileReader("ITheima\\game.txt");
        prop.load(fr);
        fr.close();
        //通过Properties集合获取到玩游戏的次数
        String count=prop.getProperty("count");
        int num=Integer.parseInt(count);
        //判断次数是否到到3次了
        if(num>=3){
            System.out.println("试玩结束，请投币！");
        }else {
            GuessNumber.start();
            num++;
            prop.setProperty("count",String.valueOf(num));
            FileWriter fw=new FileWriter("ITheima\\game.txt");
            prop.store(fw,"game");
            fw.close();
        }
    }
}
class GuessNumber{
    public static void start(){
        Random r=new Random();
        int x=r.nextInt(10);
        Scanner cin=new Scanner(System.in);
        while (true){
            System.out.println("请输入一个数:");
            int a=cin.nextInt();
            if (a>x){
                System.out.println("大了");
            }else if (a<x) {
                System.out.println("小了");
            }
            else if (a==x){
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}