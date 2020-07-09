package Day04.Review8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo8 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        String []colors={"♦", "♣", "♥", "♠"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int index=0;
        for (String number : numbers) {
            for (String color : colors) {
                tm.put(index,color+number);
                arr.add(index);
                index++;
            }
        }
        tm.put(index,"大王");
        arr.add(index);
        index++;
        tm.put(index,"小王");
        arr.add(index);
        Collections.shuffle(arr);
        TreeSet<Integer> p1=new TreeSet<>();
        TreeSet<Integer> p2=new TreeSet<>();
        TreeSet<Integer> p3=new TreeSet<>();
        TreeSet<Integer> dp=new TreeSet<>();
        for (int i = 0; i < arr.size(); i++) {
            if (i>=arr.size()-3){
                dp.add(arr.get(i));
            }else if (i%3==0){
                p1.add(arr.get(i));
            }else if(i%3==1){
                p2.add(arr.get(i));
            }else if(i%3==2){
                p3.add(arr.get(i));
            }
        }
        lookP("老王",p1,tm);
        lookP("老徐",p2,tm);
        lookP("老任",p3,tm);
        lookP("底牌",dp,tm);
    }
    public static void lookP(String name,TreeSet<Integer> ts,TreeMap<Integer,String> treeMap){
        System.out.print(name+"的牌是：");
        for (Integer t : ts) {
            System.out.print(treeMap.get(t)+" ");
        }
        System.out.println();
    }
}
