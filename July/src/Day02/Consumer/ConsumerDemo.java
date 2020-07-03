package Day02.Consumer;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        operatorToString("王晨阳",s-> System.out.println(s),s-> System.out.println(new StringBuilder(s).reverse().toString()));
    }

    private static void operatorToString(String name, Consumer<String> com1,Consumer<String> com2){
        com1.andThen(com2).accept(name);
    }
}
