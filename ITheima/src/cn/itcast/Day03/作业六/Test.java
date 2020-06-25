package 作业六;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("请输入矩形的长");
        int h=cin.nextInt();
        System.out.println("请输入矩形的宽");
        int w=cin.nextInt();
        MyRectangle rectangle=new MyRectangle(h,w);
        System.out.println("矩形的周长为");
        rectangle.perimeter();
        System.out.println("矩形的面积为");
        rectangle.area();
    }
}
