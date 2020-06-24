package JUNE.src.cn.itcast.Day13.Poker1;
//普通版洗牌 发牌  看牌（看牌的时候点数无序）
import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        //用ArrayList存储扑克牌
        ArrayList<String> PokerBox=new ArrayList<>();
        //牌面
        String []colors={"♦","♥","♠","♣"};
        //点数
        String []numbers={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        for (String color : colors) {
            for (String number : numbers) {
                PokerBox.add(color+number);
            }
        }
        PokerBox.add("大王");
        PokerBox.add("小王");
        Collections.shuffle(PokerBox);
        ArrayList<String> wcyP=new ArrayList<>();
        ArrayList<String> rcP=new ArrayList<>();
        ArrayList<String> xxP=new ArrayList<>();
        ArrayList<String> diP=new ArrayList<>();
        for (int i = 0; i < PokerBox.size(); i++) {
            String poker = PokerBox.get(i);
            if (i >= PokerBox.size() - 3) {
                diP.add(poker);
            } else if (i % 3 == 0) {
                wcyP.add(poker);
            } else if (i % 3 == 1) {
                rcP.add(poker);
            } else if (i % 3 == 2) {
                xxP.add(poker);
            }
        }
        lookpoker("王晨阳",wcyP);
        lookpoker("任晨",rcP);
        lookpoker("徐熙",xxP);
        lookpoker("底牌",diP);
    }
    public static void lookpoker(String Name,ArrayList<String> arr){
        System.out.print(Name+"的牌是：");
        for (String poker : arr) {
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
