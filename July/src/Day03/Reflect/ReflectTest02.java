package Day03.Reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest02{
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Properties prop=new Properties();
        FileReader fr=new FileReader("July\\Class.txt");
        prop.load(fr);
        fr.close();
        String className=prop.getProperty("className");
        String methondName=prop.getProperty("methodName");
        Class<?> c=Class.forName(className);
        Constructor<?> constructor = c.getConstructor();
        Object o = constructor.newInstance();
        Method m = c.getDeclaredMethod(methondName);
        m.invoke(o);
    }
}
