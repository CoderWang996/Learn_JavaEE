package Day03.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo04 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("Day03.Class.Student");
        //Student s = new Student();
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        //s.method1();
        Method method1 = c.getMethod("method1");
        method1.invoke(obj);
        //s.method2("林青霞");
        Method method2 = c.getMethod("method2", String.class);
        method2.invoke(obj,"林青霞");
//        String ss = s.method3("林青霞",30);
//        System.out.println(ss);
        Method method3 = c.getMethod("method3", String.class, int.class);
        Object o = method3.invoke(obj, "林青霞", 30);
        System.out.println(o);
//        s.function();
//        Method m4 = c.getMethod("function"); //NoSuchMethodException: com.itheima_02.Student.function()
        Method method = c.getDeclaredMethod("function");
        method.setAccessible(true);
        method.invoke(obj);
    }
}