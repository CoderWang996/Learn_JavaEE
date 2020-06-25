package 作业五;
/*
定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)

3.调用成员方法,打印格式如下:

```text
工号为123基本工资为15000奖金为6000的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码..... 工号为135基本工资为10000的程序员正在努力的写着代码......
```
 */
public class Test {
    public static void main(String[] args) {
        Manager m1=new Manager();
        m1.setName("王晨阳");
        m1.setId("2701170119");
        m1.setSalary(12000);
        m1.setBonus(3000);
        Coder c1=new Coder();
        c1.setName("任晨");
        c1.setId("2701170114");
        c1.setSalary(6500);
        m1.work();
        c1.work();
        Manager m2=new Manager("廖代","2701170107",10000,2500);
        Coder c2=new Coder("徐熙","2701170126",6800);
        m2.work();
        c2.work();
    }
}
