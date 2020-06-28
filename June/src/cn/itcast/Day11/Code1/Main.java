package cn.itcast.Day11.Code1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<String>();
        Scanner cin=new Scanner(System.in);
        System.out.println("请输入5个字符串：");
        for (int i = 0; i < 5; i++) {
            c.add(cin.nextLine());
        }
        Iterator<String> it=c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
