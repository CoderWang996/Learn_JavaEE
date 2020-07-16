package Day07.Lamda.Review7;
interface myPareint{
    int StrtoInt(String s);
}
public class Demo7 {
    public static void main(String[] args) {
        usemyP(Integer::parseInt);
    }
    private static void usemyP(myPareint my){
        System.out.println(my.StrtoInt("999"));
    }
}
