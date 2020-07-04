package Day03.Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c=Class.forName("Day03.Class.Student");
        //Constructor<?>[] getConstructors() 返回一个包含 Constructor对象的数组， Constructor对象反映了由该 Class对象表示的类的所有公共构造函数
//        Constructor<?>[] cons=c.getConstructors();
        //Constructor<?>[] getDeclaredConstructors() 返回反映由该 Class对象表示的类声明的所有构造函数的 Constructor对象的数组
        Constructor<?>[] cons1=c.getDeclaredConstructors();
        for (Constructor<?> constructor : cons1) {
            System.out.println(constructor);
        }
        System.out.println("--------");

        //Constructor<T> getConstructor(Class<?>... parameterTypes) 返回一个 Constructor对象，该对象反映由该 Class对象表示的类的指定公共构造函数
        //Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes) 返回一个 Constructor对象，该对象反映由此 Class对象表示的类或接口的指定构造函数
        //参数：你要获取的构造方法的参数的个数和数据类型对应的字节码文件对象
        Constructor<?> con=c.getConstructor();


        //Constructor提供了一个类的单个构造函数的信息和访问权限
        //T newInstance(Object... initargs) 使用由此 Constructor对象表示的构造函数，使用指定的初始化参数来创建和初始化构造函数的声明类的新实例
        Object obj=con.newInstance();
        System.out.println(obj);

    }
}
