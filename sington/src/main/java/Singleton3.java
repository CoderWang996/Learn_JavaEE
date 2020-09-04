public class Singleton3 {
    //双检锁/双重校验锁
    private volatile static Singleton3 singleton;
    private Singleton3(){}
    public static Singleton3 getInstance(){
        if (singleton==null){
            synchronized (Singleton3.class){
                if (singleton==null){
                    singleton=new Singleton3();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton3 instance1 = getInstance();
        Singleton3 instance2 = getInstance();
        System.out.println(instance1==instance2);
    }
}
