package cn.itcast.Day12.LinkedHashSet;

import java.util.LinkedHashSet;

public class Main2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(99);
        lhs.add(77);
        lhs.add(30);
        lhs.add(49);
        for (Integer lh : lhs) {
            System.out.println(lh);
        }
    }
}
