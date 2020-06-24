package JUNE.src.cn.itcast.Day13.alphbet_count;
/*
键盘录入一个字符串，统计每个字母出现的次数
输出示例：a(1)b(2)e(3)g(3)h(6)i(3)j(2)n(2)o(5)
 */
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("请录入一个字符串：");
        String s=cin.next();
        TreeMap<Character,Integer> tm=new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
           char key=s.charAt(i);
           Integer value=tm.get(key);
           if(value==null){
               //如果是第一次出现则value值为1，然后往TreeMap里put
               tm.put(key,1);
           }else {
               //有重复value就+1后往TreeMap里put
               value++;
               tm.put(key,value);
           }
        }
        StringBuilder sb=new StringBuilder();
        Set<Character> keys= tm.keySet();
        for (Character key : keys) {
            sb.append(key+"("+tm.get(key)+")");
        }
        System.out.println(sb.toString());
    }
}
