package JUNE.src.cn.itcast.Day13.Poker2;
//加强版洗牌 发牌  看牌
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Demo2 {
    static HashMap<Integer,String> hm=new HashMap<>();
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        String []colors={"♦","♥","♠","♣"};
        String []numbers={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        int index=0;
        for (String number : numbers) {
            for (String color : colors) {
                hm.put(index,color+number);
                array.add(index);
                index++;
            }
        }
        hm.put(index,"大王");
        array.add(index);
        index++;
        hm.put(index,"小王");
        array.add(index);
        Collections.shuffle(array);
        TreeSet<Integer> wcyp=new TreeSet<>();
        TreeSet<Integer> rcp=new TreeSet<>();
        TreeSet<Integer> xxp=new TreeSet<>();
        TreeSet<Integer> dip=new TreeSet<>();
        for (int i = 0; i < array.size(); i++) {
           int x= array.get(i);
           if(i>=array.size()-3){
               dip.add(x);
           }else if (i%3==0){
               wcyp.add(x);
           }else if (i%3==1){
               rcp.add(x);
           }else if (i%3==2){
               xxp.add(x);
           }
        }
        lookpoker("王晨阳",wcyp);
        lookpoker("任晨",rcp);
        lookpoker("徐熙",xxp);
        lookpoker("底牌",dip);
    }
    public static void lookpoker(String name, TreeSet<Integer> ts){
        System.out.print(name+"的牌是：");
        for (Integer t : ts) {
            System.out.print(hm.get(t)+" ");
        }
        System.out.println();
    }
}
