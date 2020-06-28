package cn.itcast.Day08.Homework3;

import java.util.ArrayList;
import java.util.Random;

/*
已知马上阿里巴巴要开年会了，那么年会就要抽奖，现在有这么几个人有资格参与抽奖：
柳岩， 杨幂， 范冰冰， 马蓉， 马保国， 李小璐， 波多野
要求使用程序实现如下效果:
​	进行第一轮抽奖:
​		恭喜 "柳岩"中奖了, 奖品是茄子一根。
​	进行第二轮抽奖：
​		恭喜 “李小璐” 中奖了， 奖品是8888红包一个。
​	进行第三轮抽奖：
​		恭喜 "马保国" 中奖了， 奖品是安排和徐晓东pk一把。
以上输出内容中，抽奖得轮次和奖品是固定得，但是中奖得人名是随机，并且一旦中奖，后续抽奖不能参与。
        */
public class Main {
    public static void main(String[] args) {
        Random r=new Random();
        ArrayList<String> arr=new ArrayList<>();
        arr.add("柳岩");
        arr.add("杨幂");
        arr.add("范冰冰");
        arr.add("马蓉");
        arr.add("马保国");
        arr.add("李小璐");
        arr.add("波多野");
        System.out.println("进行第一轮抽奖:");
        int index1=r.nextInt(7);
        System.out.println("恭喜 \""+arr.get(index1)+"\"中奖了， 奖品是8888红包一个。");
        arr.remove(index1);
        System.out.println("进行第二轮抽奖：");
        int index2=r.nextInt(6);
        System.out.println("恭喜 \""+arr.get(index2)+"\"中奖了, 奖品是茄子一根。");
        arr.remove(index2);
        System.out.println("进行第三轮抽奖：");
        int index3=r.nextInt(5);
        System.out.println("恭喜 \""+arr.get(index3)+"\"中奖了， 奖品是安排和徐晓东pk一把。");
    }
}
