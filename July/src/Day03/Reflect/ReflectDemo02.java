package Day03.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> c=Class.forName("Day03.Class.Student");
        //Student s = new Student();
        Constructor<?> constructor = c.getConstructor();
        Object o=constructor.newInstance();
        System.out.println(o);
        System.out.println("--------------------------------------------------");
//      s.name = "林青霞";
//      Field nameField = c.getField("name"); //NoSuchFieldException: name
        Field name = c.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"林青霞");
        System.out.println(o);
        System.out.println("--------------------------------------------------");
        //s.age = 30;
        Field age = c.getDeclaredField("age");
        age.setAccessible(true);
        age.set(o,30);
        System.out.println(o);
        System.out.println("---------------------------------------------------");
        //s.address = "西安";
        Field address = c.getDeclaredField("address");
        address.setAccessible(true);
        address.set(o,"西安");
        System.out.println(o);
    }
}
