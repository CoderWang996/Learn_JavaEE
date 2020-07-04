package Day03.Homework4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

//请利用反射的知识，将集合中的属性值通过学生实体类的set方法，封装到一个学生对象中，并打印该对象展示。
class Student {
    private String id;
    private String name;
    private Integer age;
    private String birthday;

    // getters and setters...

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    // toString()...

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
public class Test4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", "heima001");
        map.put("name", "张三");
        map.put("age", 23);
        map.put("birthday", "1999-09-09");
        Class<?> c=Class.forName("Day03.Homework4.Student");
        Constructor<?> con = c.getDeclaredConstructor();
        Object o = con.newInstance();
        Field id = c.getDeclaredField("id");
        id.setAccessible(true);
        id.set(o,map.get("id"));
        Field name = c.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,map.get("name"));
        Field age = c.getDeclaredField("age");
        age.setAccessible(true);
        age.set(o,map.get("age"));
        Field birthday = c.getDeclaredField("birthday");
        birthday.setAccessible(true);
        birthday.set(o,map.get(("birthday")));
        System.out.println(o);
    }
}
