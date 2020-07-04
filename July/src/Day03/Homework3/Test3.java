/*
【编号2405】在当前模块目录下有properties格式的配置文件（直接准备好即可），内容如下：
className=com.itheima.Teacher
methodName=teach
同时，在com.itheima包下定义标准的JavaBean，名为Teacher，
提供teach方法（无参无返回值，自定义即可）。 请读取该配置文件，使用反射技术，加载这个类，并运行配置的方法。
 */
package Day03.Homework3;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test3{
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
