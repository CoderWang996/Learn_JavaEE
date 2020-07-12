package Day06.SellTickets;

//某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票
//用静态同步方法
class SellTickets implements Runnable{
    private static int tickets=100;

    @Override
    public void run() {
        while (tickets>0){
            sellTicket();
        }
    }
    private static synchronized void sellTicket(){
        if (tickets>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票。");
            tickets--;
        }
    }
}
public class Demo2 {
    public static void main(String[] args) {
        SellTickets st=new SellTickets();
        Thread t1=new Thread(st,"窗口一");
        Thread t2=new Thread(st,"窗口二");
        Thread t3=new Thread(st,"窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}
