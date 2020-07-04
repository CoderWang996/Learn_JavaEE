package Day03.Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c=Class.forName("Day03.Class.Student");
        //private Student(String name)
        //Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
        Constructor<?> declaredConstructor = c.getDeclaredConstructor(String.class);
        //暴力反射
        //public void setAccessible(boolean flag):值为true，取消访问检查
        declaredConstructor.setAccessible(true);
        Object obj=declaredConstructor.newInstance("吴旭晨");
        System.out.println(obj);
    }
}
