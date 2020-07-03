package Day02.Consumer;

import java.util.function.Consumer;

/*
案例需求
String[] strArray = {"林青霞,30", "张曼玉,35", "王祖贤,33"};
字符串数组中有多条信息，请按照格式：“姓名：XX,年龄：XX"的格式将信息打印出来
要求：
把打印姓名的动作作为第一个Consumer接口的Lambda实例
把打印年龄的动作作为第二个Consumer接口的Lambda实例
将两个Consumer接口按照顺序组合到一起使用
 */
public class ConsumerTest {
    public static void main(String[] args) {
        String []str={"王晨阳，21","任晨，22"};
        printInfo(str,s-> System.out.print("姓名："+s.split("，")[0]),
                  s-> System.out.println(",年龄：" + Integer.parseInt(s.split("，")[1])));
    }
    private static void printInfo(String []arr, Consumer<String> con1,Consumer<String> con2){
        for (String s : arr) {
            con1.andThen(con2).accept(s);
        }
    }
}
