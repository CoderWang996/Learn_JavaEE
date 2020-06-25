package 继承七;

public class Test {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.setAge(32);
        t1.setName("老王");
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();
        Teacher t2=new Teacher("老刘",44);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();
    }
}