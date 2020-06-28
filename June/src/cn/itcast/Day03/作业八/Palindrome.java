package cn.itcast.Day03.作业八;

import java.util.Scanner;
/*
### 题目八

请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。例如："abcba"、"上海自来水来自海上"均为对称字符串。
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        sb.append(cin.nextLine());
        System.out.println(ISPalindrome(sb));
    }
    public static boolean ISPalindrome(StringBuilder sb){
        String s1=sb.toString();
        String s2=sb.reverse().toString();
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}