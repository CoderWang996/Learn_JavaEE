package Day01.Homework1;
/*
请观察如下代码，并使用Lambda表达式改写，实现相同的效果。
// 使用匿名内部类的方式实现多线程
Runnable runnable1 = new Runnable() {
    public void run() {
        System.out.println("do something...");
    }
}
 */
public class Test1 {
    public static void main(String[] args) {
        new Thread(()-> System.out.println("do something")).start();
    }
}