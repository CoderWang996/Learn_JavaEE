public class Demo15 {
    public static void main(String[] args) {
        String s1="hello";
        String s2="你好";
        String s3="你好"+"hello";
        String s4=s1+s1;
        System.out.println(s3==s4);//false
        System.out.println(s1==(s2+"world"));//false
    }
}
