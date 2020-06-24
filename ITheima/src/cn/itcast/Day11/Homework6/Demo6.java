package cn.itcast.Day11.Homework6;

import java.util.ArrayList;
/*
【编号：1406】某程序员从网页中获取了一些字符串类型的QQ号码存入了列表ArrayList中，
但忘记了做数字长度校验，
如下["123", "1234", "12345", "654123", "456789123", "1112222333444", "555555", ]。
QQ的长度只有5-10位才是有效号码，很显然有一些非法数据。
请删除其中那些不符合条件的号码，并将合法数据遍历输出。 运行结果：
12345
654123
56789123
555555
 */
public class Demo6 {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("123");
        a.add("1234");
        a.add("12345");
        a.add("654123");
        a.add("456789123");
        a.add("1112222333444");
        a.add("555555");
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).length()>10||a.get(i).length()<5){
                a.remove(i);
            }
        }
        System.out.println(a);
    }
}
