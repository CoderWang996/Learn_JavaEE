package cn.itcast.Day18.Homework;
/*
【编号2005】有一个存放牛奶的箱子，送奶工将牛奶放入箱子
 而用户从箱子中获取到牛奶，假设箱子只能存储一瓶牛奶，请编写程序模拟牛奶的存储和获取过程。
 */
class Box {
    public int milk;
    public boolean state=false;
    public void put(int milk){
        this.milk=milk;
        System.out.println("送奶工把第"+milk+"瓶奶放入奶箱");
    }
    public void get(){
        System.out.println("用户拿走第"+milk+"瓶奶");
    }
}
public class Test5 {
    public static void main(String[] args) {
        Box b=new Box();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (b){
                    for (int i = 1; i <= 10; i++) {
                        if (b.state){
                            try {
                                b.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        b.put(i);
                        b.state=true;
                        b.notify();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (b){
                    while (true){
                        if (!b.state){
                            try {
                                b.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        b.get();
                        b.state=false;
                        b.notify();
                    }
                }
            }
        }).start();
    }
}
