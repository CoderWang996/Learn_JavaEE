package Day07.fanshe.Review3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

//通过反射获取公共的构造方法并创建对象
class Student {
    //成员变量：一个私有，一个默认，一个公共
    private String name;
    int age;
    public String address;

    //构造方法：一个私有，一个默认，两个公共
    public Student() {
    }

    private Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //成员方法：一个私有，四个公共
    private void function() {
        System.out.println("function");
    }

    public void method1() {
        System.out.println("method");
    }

    public void method2(String s) {
        System.out.println("method:" + s);
    }

    public String method3(String s, int i) {
        return s + "," + i;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

//通过反射获取成员变量并赋值
public class Demo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> c=Class.forName("Day07.fanshe.Review3.Student");
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        Field name = c.getDeclaredField("name");
        name.setAccessible(true);
        name.set(obj,"王晨阳" );
        Field age = c.getDeclaredField("age");
        age.set(obj,18);
        Field address = c.getDeclaredField("address");
        address.set(obj,"中国");
        System.out.println(obj);
    }
}
