package cn.itcast.Day18.Homework;
/*
【编号2002】请使用实现Runnable接口的方式实现多线程。
要求开启两条线程，每条线程执行的任务都是将1-100的数据打印一遍，并且在控制台可以看出是哪条线程打印的数据。
 */
class myRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
    }
}
public class Test2 {
    public static void main(String[] args) {
        myRunnable m=new myRunnable();
        Thread t1=new Thread(m,"线程1");
        Thread t2=new Thread(m,"线程2");
        t1.start();
        t2.start();
    }
}
