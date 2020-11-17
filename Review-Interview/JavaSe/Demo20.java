/*
* 设计一个程序  使一段代码定时3S执行一次
* */
class testSleep implements Runnable{
    @Override
    public void run() {
        System.out.println("代码定时运行！");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Demo20 {
    public static void main(String[] args) {
        testSleep testSleep = new testSleep();
        while (true){
            testSleep.run();
        }
    }
}
