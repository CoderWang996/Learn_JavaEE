package cn.itcast.Day18.BoxMilk;

public class BoxDemo {
    public static void main(String[] args) {
        Box b = new Box();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (b) {
                    for (int i = 1; i < 10; i++) {
                        if (b.state) {
                            try {
                                b.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        b.put(i);
                        b.state = true;
                        b.notify();
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (b) {
                        if (b.state) {
                            b.get();
                            b.state = false;
                            b.notify();
                        } else {
                            try {
                                b.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }).start();
    }
}
