package Day03.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c=Class.forName("Day03.Class.Student");
        //Field[] getFields() 返回一个包含 Field对象的数组， Field对象反映由该 Class对象表示的类或接口的所有可访问的公共字段
        //Field[] getDeclaredFields() 返回一个 Field对象的数组，反映了由该 Class对象表示的类或接口声明的所有字段
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("----------------------");
        //Field getField(String name) 返回一个 Field对象，该对象反映由该 Class对象表示的类或接口的指定公共成员字段
        //Field getDeclaredField(String name) 返回一个 Field对象，该对象反映由该 Class对象表示的类或接口的指定声明字段
//        Student s = new Student();
//        s.name = "陈楚";
//        System.out.println(s);
        Constructor<?> constructor = c.getConstructor();
        Field name = c.getDeclaredField("name");
        name.setAccessible(true);
        Object o=constructor.newInstance();
        name.set(o,"陈楚");
        System.out.println(o);
    }
}
