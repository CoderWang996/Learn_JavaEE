package cn.itcast.Day11.ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Hallo");
        list.add("world");
        list.add("JAVA");
        ListIterator<String> lit=list.listIterator();
        System.out.println("-------------");
        while (lit.hasNext()){
            String s=lit.next();
            System.out.println(s);
        }
        System.out.println("--------------");
        while (lit.hasPrevious()){
            String s=lit.previous();
            System.out.println(s);
        }
        ListIterator<String> lit1=list.listIterator();
        while (lit1.hasNext()){
            String s=lit1.next();
            if(s.equals("world")){
                lit1.add("你好");
            }
        }
        System.out.println("===================");
        System.out.println(list);
    }
}
