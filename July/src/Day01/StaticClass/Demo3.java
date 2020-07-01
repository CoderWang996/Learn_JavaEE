package Day01.StaticClass;

public class Demo3 {
    public static void main(String[] args) {
        inner.eat();

        s(() -> System.out.println("睡觉"));

    }

    public static void s(inner i) {
        i.sleep();
        i.shopping();
    }

}
