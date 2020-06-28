package cn.itcast.Day07.homework1;
/*
【编号：1203】请完善下列代码，在main方法中调用Inner的method方法，
并依次在控制台输出30,20,10
 */
public class Demo3 {
    public static void main(String[] args) {
        // 请在此处调用Inner类中的method方法
        Outer.Inner io=new Outer().new Inner();
        io.method();
    }
}

class Outer {
    int num = 10;
    class Inner {
        int num = 20;
        public void method(){
            int num = 30;
            // ---完善代码---
            System.out.println(num);       // 输出30
            System.out.println(this.num);       // 输出20
            System.out.println(new Outer().num);       // 输出10
        }
    }
}