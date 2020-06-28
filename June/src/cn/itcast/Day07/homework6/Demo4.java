package cn.itcast.Day07.homework6;
/*
【编号：1104】请对下列代码进行补充，打印出接口中的变量num,
随后调用method方法，要求程序与最终运行结果吻合，
（注意：打印num变量，不允许创建对象调用）
 */
public class Demo4 {
    /*
     * 请编写程序, 打印出接口中的变量num, 随后调用method方法
     * 要求程序与最终运行结果吻合
     */
    public static void main(String[] args) {
        System.out.println(Inter.num);
        Outer o=new Outer();
        o.method();
    }
}

interface Inter {
    int num = 10;
    void method();
}
class Outer implements Inter{

    @Override
    public void method() {
        System.out.println("method方法被调用");
    }
}