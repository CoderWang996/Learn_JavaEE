public class Singleton1 {
    //懒汉式单例模式
    private static Singleton1 instance;
    //私有构造方法
    private Singleton1(){}
    public static synchronized Singleton1 getInstance(){
        if (instance==null){
            instance=new Singleton1();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton1 instance1 = getInstance();
        Singleton1 instance2 = getInstance();
        System.out.println(instance1==instance2);
    }
}
