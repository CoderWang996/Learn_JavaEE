package Day01.Lambda2;

public class Demo2 {
    public static void main(String[] args) {
        sum((x,y)->x+y);
        eat(s -> System.out.println(s));
    }
    public static void sum(Addable a){
        System.out.println(a.add(10,10));
    }
    private static void eat(Eatable e){
        System.out.println("吃鸡！");
    }
}
