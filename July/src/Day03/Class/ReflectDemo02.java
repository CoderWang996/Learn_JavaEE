package Day03.Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c=Class.forName("Day03.Class.Student");
        //public Student(String name, int age, String address)
        //Constructor<T> getConstructor(Class<?>... parameterTypes)
        Constructor<?> constructor = c.getConstructor(String.class, int.class, String.class);
        //T newInstance(Object... initargs)
        Object obj=constructor.newInstance("王晨阳",21,"合肥");
        System.out.println(obj);
    }
}
