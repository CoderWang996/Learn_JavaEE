public class Singleton2 {
    //饿汉式单例模式
    private static Singleton2 instance=new Singleton2();
    private Singleton2(){}
    public static synchronized Singleton2 getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        Singleton2 instance1 = getInstance();
        Singleton2 instance2 = getInstance();
        System.out.println(instance1==instance2);
    }
}
