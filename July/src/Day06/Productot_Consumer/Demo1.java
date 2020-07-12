package Day06.Productot_Consumer;

//多线程解决生产者消费者案例
class Box{
    private int milk;
    private boolean flag;
    public synchronized void put(int milk){
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk=milk;
        System.out.println("送奶工把第"+this.milk+"瓶奶放进奶箱。");
        flag=true;
        notifyAll();
    }
    public synchronized void get(){
        if (flag==false){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("用户把第"+this.milk+"瓶奶取出。");
        flag=false;
        notifyAll();
    }
}
class Productor implements Runnable{
    private Box box;

    public Productor(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            box.put(i);
        }
    }
}
class Consumer implements Runnable{
    private Box box;

    public Consumer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (true){
            box.get();
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Box box=new Box();
        new Thread(new Productor(box)).start();
        new Thread(new Consumer(box)).start();
    }
}
