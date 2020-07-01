package Day01.Code5;

public class Demo5 {
    public static void main(String[] args) {
        useMyString((s,x,y)->s.substring(x,y));
        useMyString(String::substring);
    }
    public static void useMyString(MyString ms){
        String s=ms.mySubString("HelloWorld",1,5);
        System.out.println(s);
    }
}
