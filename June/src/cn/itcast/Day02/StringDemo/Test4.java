package cn.itcast.Day02.StringDemo;

import java.util.Scanner;

/*
    需求：
        键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)

    思路：
        1:键盘录入一个字符串，用 Scanner 实现
        2:要统计三种类型的字符个数，需定义三个统计变量，初始值都为0
        3:遍历字符串，得到每一个字符
        4:判断该字符属于哪种类型，然后对应类型的统计变量+1
            假如ch是一个字符，我要判断它属于大写字母，小写字母，还是数字，直接判断该字符是否在对应的范围即可
            大写字母：ch>='A' && ch<='Z'
            小写字母： ch>='a' && ch<='z'
            数字： ch>='0' && ch<='9'
        5:输出三种类型的字符个数
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String s=cin.nextLine();
        int smallcount=0;
        int bigcount=0;
        int numbercount=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                smallcount++;
            }else if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                bigcount++;
            }
            else if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                numbercount++;
            }
        }
        System.out.println("小写字母的个数为："+smallcount);
        System.out.println("大写字母的个数为"+bigcount);
        System.out.println("数字的个数为："+numbercount);
    }
}
