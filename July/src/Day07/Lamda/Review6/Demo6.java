package Day07.Lamda.Review6;
interface myString{
    String mySubString(String s,int a,int b);
}
public class Demo6 {
    public static void main(String[] args) {
        usemyString(String::substring);
    }
    private static void usemyString(myString my){
        System.out.println(my.mySubString("Yes I like you",4,8));
    }
}
