package cn.itcast.Day18.MilkBox;

class Box{
    private int milk;
    private boolean state=false;
    public synchronized void put(int milk) {
        if (state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk=milk;
        System.out.println("送奶工正在送第"+milk+"瓶奶");
        state=true;
        notifyAll();
    }
    public synchronized void get(){
        if (!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("少爷正在喝"+this.milk+"瓶牛奶");
        state=false;
        notifyAll();
    }
}
class Producer implements Runnable{
    private Box b;

    public Producer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        for (int i = 1; i <=10; i++) {
            b.put(i);
        }
    }
}
class Customer implements Runnable{
    private Box b;

    public Customer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        while (true){
            b.get();
        }
    }
}
public class BoxDemo {
    public static void main(String[] args) {
        Box b=new Box();
        Producer p=new Producer(b);
        Customer c=new Customer(b);
        Thread t1=new Thread(p);
        Thread t2=new Thread(c);
        t1.start();
        t2.start();
    }
}
