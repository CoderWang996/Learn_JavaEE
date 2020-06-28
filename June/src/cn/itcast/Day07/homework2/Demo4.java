package cn.itcast.Day07.homework2;

public class Demo4 {
    public static void main(String[] args) {
        Outer.method().show();
    }
}

interface Inter {
    void show();
}

class Outer {
    // 定义method方法
    public static Inter method(){
        // 返回Inter接口的匿名内部类
        return new Inter() {
            @Override
            // 重写show方法，输出HelloWorld
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }
}