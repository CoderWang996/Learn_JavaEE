package JUNE.src.cn.itcast.Day12.Homework8;
import java.util.LinkedHashSet;
import java.util.Random;

/*
【编号：1509】彩票双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
红色球号码从1~33中选择；蓝色球号码从1~16中选择；
请结合集合所学知识，随机生成一注双色球号码，要求同色号码不重复。
 */
public class Main8 {
    public static void main(String[] args) {
        Random r=new Random();
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        while (hs.size()!=6){
            int red=r.nextInt(33)+1;
            hs.add(red);
        }
        while (hs.size()!=7){
            int blue=r.nextInt(16)+1;
            hs.add(blue);
        }
        System.out.println(hs);
    }
}
