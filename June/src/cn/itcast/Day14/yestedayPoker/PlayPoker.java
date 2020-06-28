package cn.itcast.Day14.yestedayPoker;
import java.util.*;

public class PlayPoker {
    static HashMap<Integer,String> hm=new HashMap<>();
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        String []colors={"♦","♥","♠","♣"};
        String []numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int index=0;
        for (String number : numbers) {
            for (String color : colors) {
                hm.put(index,color+number);
                arr.add(index);
                index++;
            }
        }
        hm.put(index,"大王");
        arr.add(index);
        index++;
        hm.put(index,"小王");
        arr.add(index);
        Collections.shuffle(arr);
        TreeSet<Integer> wcy=new TreeSet<>();
        TreeSet<Integer> xx=new TreeSet<>();
        TreeSet<Integer> rc=new TreeSet<>();
        TreeSet<Integer> dp=new TreeSet<>();
        for (int i = 0; i < arr.size(); i++) {
            int in=arr.get(i);
            if(i>=arr.size()-3){
               dp.add(in);
            }else if (i%3==0){
                wcy.add(in);
            }else if (i%3==1){
                rc.add(in);
            }else if (i%3==2){
                xx.add(in);
            }
        }
        look("王晨阳",wcy);
        look("任晨",rc);
        look("徐熙",xx);
        look("底牌",dp);
    }
    public static void look(String name,TreeSet<Integer> treeSet){
        System.out.print(name+"的牌是：");
        for (Integer integer : treeSet) {
            System.out.print(hm.get(integer)+" ");
        }
        System.out.println();
    }
}
