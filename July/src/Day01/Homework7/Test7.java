package Day01.Homework7;
/*
函数式接口MyInter中提供了一个返回MyClass对象的抽象方法，
在测试类中，需要调用该方法获取到MyClass的对象，使用匿名内部类的方式以及给出，
请分别使用Lambda表达式和方法引用的方式改进注释部分的代码。
 */
public class Test7 {
    public static void main(String[] args) {
        // 使用匿名内部类
        /*
        MyInter mi = new MyInter() {
            @Override
            public MyClass  {
                return new MyClass(value);
            }
        };
        MyClass mc = mi.func(100);
        */
        // 使用Lambda表达式改进
//        MyInter mi=(int value)->new MyClass(value);
//        MyClass mc = mi.func(100);
        // 使用方法引用改进
        MyInter mi=MyClass::new;
        MyClass mc = mi.func(100);
        // 打印成员变量的值
        System.out.println(mc.getValue());
    }
}

// 函数式接口
interface MyInter {
    MyClass func(int value);
}

class MyClass {
    private int value;
    // 构造方法
    public MyClass(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}