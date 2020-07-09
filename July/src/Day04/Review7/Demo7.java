package Day04.Review7;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
案例需求
- 键盘录入一个字符串，要求统计字符串中每个字符串出现的次数。
- 举例：键盘录入“aababcabcdabcde”  在控制台输出：“a(5)b(4)c(3)d(2)e(1)”
 */
public class Demo7 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s=cin.nextLine();
        TreeMap<Character,Integer> tm=new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            //拿得到的每一个字符作为键到HashMap集合中去找对应的值，看其返回值
            char key=s.charAt(i);
            Integer value=tm.get(key);
            //如果返回值是null：说明该字符在HashMap集合中不存在，就把该字符作为键，1作为值存储
            if (value==null){
             tm.put(key,1);
            }else{
                value++;
                tm.put(key,value);
            }
        }
        StringBuilder sb=new StringBuilder();
        Set<Character> keys = tm.keySet();
        for (Character key : keys) {
            sb.append(key).append("(").append(tm.get(key)).append(")");
        }
        System.out.println(sb.toString());
    }
}
