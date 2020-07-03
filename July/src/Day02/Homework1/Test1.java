package Day02.Homework1;

import java.util.UUID;
import java.util.function.Supplier;
//请在主方法中调用该方法，分别按要求获取两种id并打印。
public class Test1 {
    public static void main(String[] args) {
        // 获取一个32位的UUID（参见java.util.UUID）
        String uuid=getId(()->UUID.randomUUID().toString());
        // 获取一个字符串形式的当前系统时间毫秒值的id
        String id=getId(()->String.valueOf(System.currentTimeMillis()));
    }

    /**
     * 可自义的id生成器
     * @param supplier
     * @return
     */
    public static String getId(Supplier<String> supplier) {
        return supplier.get();
    }
}
