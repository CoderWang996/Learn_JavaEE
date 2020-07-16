package Day07.Lamda.Review5;
interface mySum{
    int sum(int x,int y);
}
public class Demo5 {
    public static void main(String[] args){
        usemySum(Integer::sum);
    }
    private static void usemySum(mySum my){
        System.out.println(my.sum(10,40));
    }
}
