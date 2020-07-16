package Day07.Lamda.Review4;
interface addAble{
    int add(int x,int y);
}
public class Demo4 {
    public static void main(String[] args) {
        useaddAble((x,y)->x+y);

    }
    private static void useaddAble(addAble a){
        System.out.println(a.add(10,20));
    }
}
