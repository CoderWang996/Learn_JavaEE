package cn.itcast.Day18.SellTicket2;

import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable{
    private int tickets=100;
    private Lock lock=new ReentrantLock();

    @Override
    public void run() {
        while (true){
            lock.lock();
                //t1进来后，就会把这段代码给锁起来
                if(tickets>0){
                    try {
                        //t1休息100毫秒
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //窗口1正在出售第100张票
                    System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票");
                    tickets--;
                }
            lock.unlock();
            }
        }
    }