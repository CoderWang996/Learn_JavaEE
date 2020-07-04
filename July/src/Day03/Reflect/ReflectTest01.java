package Day03.Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //创建集合
        ArrayList<Integer> array = new ArrayList<Integer>();
        Class<?extends ArrayList> c=array.getClass();
        Method add = c.getMethod("add", Object.class);
        add.invoke(array,"hello");
        add.invoke(array,"陈楚");
        System.out.println(array);
    }
}
