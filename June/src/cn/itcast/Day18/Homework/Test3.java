package cn.itcast.Day18.Homework;

/*
【编号2003】某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，
 请设计一个程序模拟该电影院卖票，并保证线程同步，不会出现错误的买票数据。
 */
public class Test3 {
    static int tickets = 100;
    public static void main(String[] args) {
        Object o = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (o) {
                        if (tickets > 0) {
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("第一个窗口正在卖"+tickets+"张票");
                            tickets--;
                        }
                        else {
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
                    synchronized (o) {
                        if (tickets > 0) {
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("第二个窗口正在卖"+tickets+"张票");
                            tickets--;
                        }
                        else {
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
                    synchronized (o) {
                        if (tickets > 0) {
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("第三个窗口正在卖"+tickets+"张票");
                            tickets--;
                        }
                        else {
                            break;
                        }
                    }
                }
            }
        }).start();
    }
}
