package Day05.Review2;
import java.io.IOException;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        String s="我爱中国";
        byte []bytes=s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes));
        String ss=new String(bytes,"GBK");
        System.out.println(ss);
    }
}
