package Day07.Lamda.Review3;

interface Flyable {
    void Fly(String s);
}

public class Demo3 {
    public static void main(String[] args) {
        useFlyable((String s) -> {
            System.out.print(s);
            System.out.println("想要飞呀飞，却怎么样也飞不高。");
        });
    }

    private static void useFlyable(Flyable flyable) {
        flyable.Fly("我是一只小小鸟，");
    }
}
