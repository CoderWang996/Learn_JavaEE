package cn.itcast.Day03.作业九;
import java.util.Scanner;
/*
### 题目九

我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。
请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
规则为：号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。
 */
public class IDnumber {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("请输入您的身份证号码");
        String ss = cin.nextLine();
        System.out.println(ISIDnumber(ss));
    }
    public static boolean ISIDnumber(String id) {
        //号码为18位，不能以数字0开头
        if (id.length() != 18 || id.startsWith("0")) {
            return false;
        }
        //前17位只可以是数字
        for (int i = 0; i < id.length() - 1; i++) {
            if (id.charAt(i) > '9' || id.charAt(i) < '0') {
                return false;
            }
        }
        //最后一位可以是数字或者大写字母X
        if (id.endsWith("X")==false && id.charAt(17) < '0' && id.charAt(17) > '9') {
            return false;
        }
        //上面的都不满足直接返回true
        return true;
    }
}