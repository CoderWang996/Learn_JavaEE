package Day01.Homework10;
/*
需求：
        1:定义一个接口Inter，里面有四个方法：二个默认方法，二个静态方法
            default void show1(){   }
            default void show2(){   }
            static void method1(){   }
            static void method2(){   }
        2:定义接口的一个实现类：
            InterImpl
        3:定义测试类：
            InterDemo
            在主方法中，按照多态的方式创建对象并使用
 */
public class Test10 {
    public static void main(String[] args) {
        Inter inter=new InterImpl();
        inter.show1();
        inter.show2();
        Inter.method1();
        Inter.method2();
    }
}
interface Inter{
    default void show1(){  }
    default void show2(){   }
    static void method1(){   }
    static void method2(){   }
}
class InterImpl implements Inter{
}
