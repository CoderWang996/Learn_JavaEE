package Day02.Stream;

import java.util.ArrayList;

public class StreamDemo05 {
    public static void main(String[] args) {
        //创建一个集合，存储多个字符串元素
        ArrayList<String> list = new ArrayList<String>();

        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");

        //需求：将集合中的字符串数据转换为整数之后在控制台输出
//        list.stream().mapToInt(Integer::parseInt).forEach(System.out::println);

        //int sum() 返回此流中元素的总和
        System.out.println(list.stream().mapToInt(Integer::parseInt).sum());
    }
}