package cn.itcast.Day06.Code1;

/*
//【编号：1207】现有两个Person对象，
//属性都是（张三 , 23）请对Person类进行补充，
//保证程序运行后结果为true （不可修改main方法内部代码，只能操作Person类）
//运行结果：
true
 */
public class Demo7 {
    public static void main(String[] args) {
        // 创建对象，并初始化数据
        Person p1 = new Person("张三",23);
        Person p2 = new Person("张三",23);
        // 比较两个对象
        System.out.println(p1.equals(p2));
    }
}

class Person{
    private String name;
    private int age;

    /*
        请补充代码, 使程序运行结果满足需求
     */
    // 重写equals方法, 改变对象的默认比较方式
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    public Person() {
    }

    public Person(String name, int age) {
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
}