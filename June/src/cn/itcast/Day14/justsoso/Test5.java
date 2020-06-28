package cn.itcast.Day14.justsoso;

import java.util.*;

/*
1）定义一个员工类，包含工号（整型）、姓名、性别、薪资（浮点型），
该员工类需要实现Comparable接口，比较规则中以工号为比较标准
2）在main方法中定义集合存储多个员工对象，按照工号排序后输出
3）定义一个比较器，实现Comparator接口，其中将会比较两个员工对象，以薪资为比较标准，
排序后将按薪资从高到底降序输出，在main中测试
 */
//创建标准员工类并实现Comparable接口
class Worker implements Comparable<Worker>{
    private int id;
    private String name;
    private String gender;
    private double salary;

    public Worker() {
    }

    public Worker(int id, String name, String gender, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Worker o) {
        return this.id-o.id;
    }
}
public class Test5 {
    public static void main(String[] args) {
        //在main方法中定义集合存储多个员工对象,按照工号排序后输出
        Worker w1=new Worker(002,"张三","男",5000);
        Worker w2=new Worker(001,"李四","女",3000);
        Worker w3=new Worker(003,"王五","男",4500);
        Worker w4=new Worker(004,"田七","女",8000);
        Set<Worker> set1=new TreeSet<>();
        set1.add(w1);
        set1.add(w2);
        set1.add(w3);
        set1.add(w4);
        System.out.println("员工信息以工号升序输出的结果为：");
        for (Worker worker : set1) {
            System.out.println(worker);
        }
        Set<Worker> set2=new TreeSet<>(new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return (int) (o2.getSalary()-o1.getSalary());
            }
        });
        set2.add(w1);
        set2.add(w2);
        set2.add(w3);
        set2.add(w4);
        System.out.println("员工信息以薪资降序输出的结果为：");
        for (Worker worker : set2) {
            System.out.println(worker);
        }
    }
}
