package JUNE.src.cn.itcast.Day12.Homework7;

import java.util.LinkedHashSet;
import java.util.Scanner;
/*
【编号：1507】现获取到用户输入的一段字符串（可从键盘录入），
例如：aaaabbbcccccdd。请编写程序获取其中无重复的字符组成一个新的字符串，
即：abcd。请不要改变字符的输入顺序。
 */
public class  Main7 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.next();
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ss = s.charAt(i);
            lhs.add(String.valueOf(ss));
        }
        for (String sss : lhs) {
            System.out.print(sss);
        }
        System.out.println();
        StringBuilder sb=new StringBuilder();
        for (String lh : lhs) {
            sb.append(lh);
        }
        System.out.println(sb.toString());
    }
}