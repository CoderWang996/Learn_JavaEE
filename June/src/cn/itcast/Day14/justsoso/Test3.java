package cn.itcast.Day14.justsoso;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Random r=new Random();
        //循环产生100个随机整数添加到该集合对象中
        for (int i = 0; i < 100; i++) {
            arr.add(r.nextInt());
        }
        //通过迭代器Iterator遍历该集合，输出所有数据
        Iterator<Integer> i=arr.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        //通过调用get()方法读取集合中位置索引为50和102的元素，要求使用try-catch处理下标越界异常（输出信息即可）
        try {
            arr.get(502);
            arr.get(102);
        }catch (IndexOutOfBoundsException e){
            System.out.println("数组越界异常！");
            e.printStackTrace();
        }
    }
}
