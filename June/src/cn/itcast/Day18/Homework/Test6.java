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
class warehouse {
    public int product;
    boolean full = false;
    boolean Null = true;

    public void push(int product) {
        this.product = product;
        System.out.println("生产存入1个单位货物，现在仓库剩余" + product);
    }

    public void get(int product) {
        this.product = product;
        System.out.println("消费取出1个单位货物，现在仓库剩余" + product);
    }
}

public class Test6 {
    static int count = 0;

    public static void main(String[] args) {
        warehouse wh = new warehouse();
        //生产存入
        new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {
                    if (count < 10) {
                        synchronized (wh) {
                            if (wh.full) {
                                try {
                                    wh.wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                            count++;
                            wh.push(count);
                            wh.Null = false;
                            wh.notify();
                        }
                    }
                }
            }
        }).start();
        //消费取出
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (count > 0) {
                        synchronized (wh) {
                            if (wh.Null) {
                                try {
                                    wh.wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                            count--;
                            wh.get(count);
                            wh.full = false;
                            wh.notify();
                        }
                    }
                }
            }
        }).start();
    }
}
