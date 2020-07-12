package Day06.SellTickets;

//某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票
class Sell implements Runnable{
    private int tikcets=100;
    private Object o=new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (o) {
                if (tikcets > 0) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tikcets + "张票。");
                    tikcets--;
                }
            }
            if (tikcets<=0){
                break;
            }
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Sell sell=new Sell();
        Thread t1=new Thread(sell,"窗口1");
        Thread t2=new Thread(sell,"窗口2");
        Thread t3=new Thread(sell,"窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
