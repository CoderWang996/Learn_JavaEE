public class Demo17 {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j == i) {
                    continue;
                }
                for (int k = 1; k <= 4; k++) {
                    if (k == j || k == i) {
                        continue;
                    }
                    n++;
                    System.out.print(i);
                    System.out.print(j);
                    System.out.print(k);
                    System.out.println();
                }
            }
        }
        System.out.println("可以组成"+n+"个三位数");
    }
}
