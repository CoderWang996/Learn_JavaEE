package cn.itcast.Day08.Homework3_1;

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
        String []arr=new String[]{"柳岩","杨幂","范冰冰","马蓉","马保国","李小璐","波多野"};
        while (true){
            int index1=r.nextInt(7);
            int index2=r.nextInt(7);
            int index3=r.nextInt(7);
            if(index1!=index2&&index1!=index3&&index2!=index3){
                System.out.println("进行第一轮抽奖:");
                System.out.println("恭喜 \""+arr[index1]+"\"中奖了， 奖品是8888红包一个。");
                System.out.println("进行第二轮抽奖：");
                System.out.println("恭喜 \""+arr[index2]+"\"中奖了, 奖品是茄子一根。");
                System.out.println("进行第三轮抽奖：");
                System.out.println("恭喜 \""+arr[index3]+"\"中奖了， 奖品是安排和徐晓东pk一把。");
                break;
            }
        }
    }
}
