package cn.itcast.Day04.ArrayList;
//AArrayList遍历
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("王晨阳");
        arrayList.add(("任晨"));
        arrayList.add("徐熙");
        for (int i = 0; i < arrayList.size(); i++) {
            String s=arrayList.get(i);
            System.out.println(s);
        }
    }
}
