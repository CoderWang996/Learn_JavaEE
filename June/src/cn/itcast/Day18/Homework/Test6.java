package cn.itcast.Day18.Homework;

import java.util.TreeMap;

/*
【编号2006】假设某公司自产、自存、自销，需要将生产的产品不定时的运到仓库，
 与此同时，需要将仓库中的产品运往商场中进行销售，请编写一个程序模拟此过程
（主要是仓库存取产品这个过程）。要求： 1、仓库的存量是固定的，可以假设为一个常量，
 比如10。 2、仓库满的时候，不能再向仓库中存储货物，同理，仓库空的时候，
 不能取出货物。 3、存货和取货是同时进行的，
 不要设计成先存满再取完或者存一个取一个这样的效果，
 但由于存取的不确定性，中间过程中允许出现一部分上述效果。
 程序运行效果如下：
生产存入1个单位货物，现在仓库剩余1
生产存入1个单位货物，现在仓库剩余2
消费取出1个单位货物，现在仓库剩余1
消费取出1个单位货物，现在仓库剩余0
生产存入1个单位货物，现在仓库剩余1
生产存入1个单位货物，现在仓库剩余2
生产存入1个单位货物，现在仓库剩余3
生产存入1个单位货物，现在仓库剩余4
生产存入1个单位货物，现在仓库剩余5
消费取出1个单位货物，现在仓库剩余4
消费取出1个单位货物，现在仓库剩余3
消费取出1个单位货物，现在仓库剩余2
消费取出1个单位货物，现在仓库剩余1
消费取出1个单位货物，现在仓库剩余0
。。。
 */
public class Test6 {
    public static void main(String[] args) {
        // 创建仓库
        Storehouse store = new Storehouse(10); // 默认有10个

        // 生产线程
        new Thread(new Produce(store), "生产").start();

        // 消费线程
        new Thread(new Consume(store), "消费").start();
        //new Thread(new Consume(store), "消费2").start();
    }
}

// 仓库类
class Storehouse {
    private int capacity;

    public Storehouse(int capacity) {
        this.capacity = capacity;
    }

    // 存放货物的方法
    public synchronized void put() {
        while (capacity >= 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        capacity += 1;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "存入1个单位货物，现在仓库剩余" + capacity);
        notifyAll();
    }

    // 取出货物的方法
    public synchronized void get() {
        while (capacity <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        capacity -= 1;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "取出1个单位货物，现在仓库剩余" + capacity);
        notifyAll();
    }
}

class Produce implements Runnable {

    private Storehouse store;

    public Produce(Storehouse store) {
        this.store = store;
    }

    private static int num = 0;

    @Override
    public void run() {
        // 生产1000份
        while (num < 1000) {
            store.put();
            // 每生产100份 休息5秒
            if (++num % 100 == 0) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Consume implements Runnable {
    private Storehouse store;

    public Consume(Storehouse store) {
        this.store = store;
    }

    @Override
    public void run() {
        // 取货，有就取
        while (true) {
            store.get();
        }
    }
}