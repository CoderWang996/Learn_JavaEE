package Day03.Homework1;

        import java.lang.reflect.InvocationTargetException;
        import java.lang.reflect.Method;
        import java.util.ArrayList;

/*
请利用反射技术，在一个泛型声明为Integer类型的ArrayList集合中，添加String类型的元素。
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> arr=new ArrayList<>();
        Class<?extends ArrayList> c=ArrayList.class;
        Method add = c.getMethod("add", Object.class);
        add.invoke(arr,"hello");
        System.out.println(arr);
    }
}
