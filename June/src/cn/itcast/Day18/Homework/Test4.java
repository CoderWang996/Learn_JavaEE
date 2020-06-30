package cn.itcast.Day18.Homework;

import java.util.ArrayList;
import java.util.Random;
/*
【编号2004】有一个抽奖池，里面存放了一些固定金额的奖金
此时，有两个人A和B轮流在奖箱中随机抽奖（即A抽一次-->B抽一次-->A抽一次-->B抽一次...），
直到所有的奖金都被抽出，每次抽奖耗时1秒。请编写程序，使用两个线程模拟两人的抽奖过程，
输出结果如下（金额的顺序随机）：
A抽出奖金600
B抽出奖金1000
A抽出奖金900
B抽出奖金300
A抽出奖金500
B抽出奖金200
A抽出奖金700
B抽出奖金100
A抽出奖金800
B抽出奖金400
 */
class Cj {
    public boolean flag = false;

    public void A(int jj) {
        System.out.println("A抽出奖金" + jj);
    }

    public void B(int jj) {
        System.out.println("B抽出奖金" + jj);
    }
}

public class Test4 {
    public static void main(String[] args) {
        int[] prizePool = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        Random r = new Random();
        Cj c = new Cj();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < prizePool.length; i++) {
            list.add(prizePool[i]);
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (c) {
                        if (list.size() > 0 && c.flag) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            int index = r.nextInt(list.size());
                            c.A(list.get(index));
                            list.remove(index);
                            c.flag = false;
                            c.notify();
                        } else if (list.size() > 0 && !c.flag) {
                            try {
                                c.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        } else if (list.size() <= 0) {
                            break;
                        }
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (c) {
                        if (list.size() > 0 && !c.flag) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            int index = r.nextInt(list.size());
                            c.B(list.get(index));
                            list.remove(index);
                            c.flag = true;
                            c.notify();
                        } else if (list.size() > 0 && c.flag) {
                            try {
                                c.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        } else if (list.size() <= 0) {
                            break;
                        }
                    }
                }
            }
        }).start();
    }
}

