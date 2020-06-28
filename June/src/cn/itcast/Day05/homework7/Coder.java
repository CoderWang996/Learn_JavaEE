package homework7;
/*
结合继承的思想，分析下列需求并实现
定义项目经理类Manager 【属性：姓名 工号 工资 奖金】【行为：工作work】
定义程序员类Coder【属性：姓名 工号 工资】【行为：工作work】
要求：通过有参构造创建两个类的对象，并调用各自的work方法
 */
public class Coder {
    public String name;
    public String id;
    public double salary;
    public Coder(){}

    public Coder(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //姓名为:张三,工号为:9527,工资为:10000.0,的程序员正在编写代码
    public void work(){
        System.out.println("姓名为:"+name+",工号为:"+id+",工资为:"+salary+",的程序员正在编写代码");
    }
}
