package cn.itcast.Day07.honework4;

import java.util.ArrayList;
import java.util.Objects;

/*
【编号：1208】某公司发放年终礼品，但hr在统计的时候发现有很多同姓名同年龄的员工，
所以决定对这一部分员工，发放【缘分大礼包】，其余员工发放【普通大礼包】，
请用技术手段，完成礼品的分发。 现有4个员工信息：
张三，23
李四，24
张三，23
张三，28
运行结果：
Employee{name=张三,age=23}获得了缘分大礼包
Employee{name=李四,age=24}获得了普通大礼包
Employee{name=张三,age=23}获得了缘分大礼包
Employee{name=张三,age=28}获得了普通大礼包
 */
public class Demo4 {
    public static void main(String[] args) {
        Employee e1=new Employee("张三",23);
        Employee e2=new Employee("李四",24);
        Employee e3=new Employee("张三",23);
        Employee e4=new Employee("张三",28);
        ArrayList<Employee> a=new ArrayList<>();
        a.add(e1);
        a.add(e2);
        a.add(e3);
        a.add(e4);
        for (int i = 0; i < a.size(); i++) {
            boolean falg=false;
            Employee ee=a.get(i);
            for (int i1 = 0; i1 < a.size(); i1++) {
                if(i!=i1){
                    if(ee.equals(a.get(i1))){
                        falg=true;
                    }
                }
            }
            if(falg==true){
                System.out.println(a.get(i)+"获得了缘分大礼包");
            }else{
                System.out.println(a.get(i)+"获得了普通大礼包");
            }
        }
    }
}
class Employee{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name, employee.name);
    }

    public Employee() {
    }

    public Employee(String name, int age) {
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