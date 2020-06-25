package homework8;
/*
【编号：1008】某公司骨干程序员设计了一个TestA类，
该类包含了公司的核心业务逻辑method方法，
现需要将TestA交给其他同事去使用，其他同事可以丰富一些新的方法，
但不能改动原有功能（不能改method方法实现内容），
如果TestA类交给你来写，怎样可以强制method方法不能改？请结合以上信息，将如下代码补齐。
运行结果：
我是核心业务逻辑，可以使用，但绝对不能改动！
新增加的show方法
新增加的print方法
 */
class TestA {
    public void method(){
        System.out.println("我是核心业务逻辑，可以使用，但绝对不能改动！");
    }
}

class TestB extends TestA{
    /*
        该类需要使用TestA中的method方法，还需要增加一些新的功能
     */
    public void show(){
        System.out.println("新增加的show方法");
    }
    public void print(){
        System.out.println("新增加的print方法");
    }
}

public class Demo7 {
    public static void main(String[] args) {
        TestB t = new TestB();
        t.method();
        t.show();
        t.print();
    }
}