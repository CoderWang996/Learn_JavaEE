//java多线程-生产者消费者
//定义奶箱类
class Box {
    //定义一个成员变量，表示第x瓶奶
    private int milk;
    //定义一个成员变量，表示奶箱的状态
    private boolean state = false;

    //放奶操作
    public synchronized void put(int milk) {
        //先判断奶箱是否有奶,有就等待，没有就放
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //生产牛奶
        this.milk = milk;
        System.out.println("第" + milk + "瓶奶已放入奶箱！");
        //修改奶箱状态
        state = true;
        //唤醒消费线程
        notifyAll();
    }

    //取奶操作
    public synchronized void get() {
        //根据奶箱状态决定是取奶还是等待
        if (!state) {
            try {
                //等待
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //取奶
        System.out.println("第" + this.milk + "瓶奶已经被取出！");
        //修改奶箱状态
        state = false;
        //唤醒生产线程
        notifyAll();
    }
}

//创建生产者类
class Provider implements Runnable {
    private Box box;

    public Provider(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            box.put(i);
        }
    }
}

//创建消费者类
class Consumer implements Runnable {
    private Box box;

    public Consumer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (true) {
            box.get();
        }
    }
}

//测试类
public class Demo12 {
    public static void main(String[] args) {
        //创建Box对象
        Box box = new Box();
        //创建生产者对象
        Provider provider = new Provider(box);
        //创建消费者对象
        Consumer consumer = new Consumer(box);

        //创建2个线程对象，分别把生产者对象和消费者对象作为构造方法参数传递
        Thread thread1 = new Thread(provider);
        Thread thread2 = new Thread(consumer);

        //启动线程
        thread1.start();
        thread2.start();
    }
}
