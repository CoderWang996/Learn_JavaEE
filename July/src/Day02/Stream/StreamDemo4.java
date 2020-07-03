package Day02.Stream;

import java.util.ArrayList;

public class StreamDemo4 {
    public static void main(String[] args) {
        //创建一个集合，存储多个字符串元素
        ArrayList<String> list = new ArrayList<String>();

        list.add("linqingxia");
        list.add("zhangmanyu");
        list.add("wangzuxian");
        list.add("liuyan");
        list.add("zhangmin");
        list.add("zhangwuji");

        //需求1：按照字母顺序把数据在控制台输出
//        list.stream().sorted().forEach(System.out::println);
        //需求2：按照字符串长度把数据在控制台输出
        list.stream().sorted((s1,s2)->{
           int num1=s1.length()-s2.length();
           int num2= num1==0?s1.compareTo(s2):num1;
           return num2;
        }).forEach(System.out::println);
    }
}