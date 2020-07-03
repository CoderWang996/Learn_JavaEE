package Day02.Supplier;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        int[] arr = {19, 50, 28, 37, 46};
        int maxValue = getMax(() -> {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        });
        System.out.println(maxValue);
        String []str={"aaa","bb","cccccccc","x"};
        String longetLine=getlongest(()->{
           String line=str[0];
            for (int i = 0; i < str.length; i++) {
                if(line.length()<str[i].length()){
                    line=str[i];
                }
            }
            return line;
        });
        System.out.println("最长的是"+longetLine);
    }

    private static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    private static String getlongest(Supplier<String> sup) {
        return sup.get();
    }
}