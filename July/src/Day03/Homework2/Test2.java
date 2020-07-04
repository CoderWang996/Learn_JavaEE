package Day03.Homework2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
class Student {
    private String name;
    private int age;

    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 显示信息的方法
    public void showInfo() {
        System.out.println(name + " - " + age);
    }
}
public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> c=Class.forName("Day03.Homework2.Student");
        Constructor<?> con = c.getDeclaredConstructor();
        Object o=con.newInstance();
        Field name = c.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"王晨阳");
        Field age = c.getDeclaredField("age");
        age.setAccessible(true);
        age.set(o,21);
        Method showInfo = c.getDeclaredMethod("showInfo");
        showInfo.invoke(o);
    }
}
