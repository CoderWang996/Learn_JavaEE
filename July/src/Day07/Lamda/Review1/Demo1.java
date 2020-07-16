package Day07.Lamda.Review1;
public class Demo1 {
    public static void main(String[] args) {
        new Thread(()-> System.out.println("线程启动了！")).start();
    }
}