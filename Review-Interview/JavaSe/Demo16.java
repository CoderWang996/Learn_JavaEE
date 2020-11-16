/*
switch语句Default
默认执行它下面第一条语句
 */
public class Demo16 {
    public static void main(String[] args) {
        char mychar='c';
        switch (mychar){
            default:
            case 'a': System.out.println("1");break;
            case 'b': System.out.println("2");break;
        }
    }
}
