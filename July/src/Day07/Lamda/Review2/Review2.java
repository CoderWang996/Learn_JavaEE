package Day07.Lamda.Review2;
interface Eatable{
    void eat();
}
public class Review2 {
    public static void main(String[] args) {
        useEatable(()-> System.out.println("一天一苹果，医生远离我。"));
    }
    private static void useEatable(Eatable e){
        e.eat();
    }
}
