package cn.itcast.Day18.Homework;
/*
【编号2001】请使用继承Thread类的方式实现多线程。要求开启两条线程，
每条线程执行的任务都是将1-100的数据打印一遍，并且在控制台可以看出是哪条线程打印的数据。
 */
class MyThread extends Thread{
    public MyThread(){}
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName()+": "+i);
        }
    }
}
public class Test1 {
    public static void main(String[] args) {
        MyThread my1=new MyThread("线程1");
        MyThread my2=new MyThread("线程2");
        my1.start();
        my2.start();
    }
}
