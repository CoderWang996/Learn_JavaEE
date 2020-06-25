package homework7;
/*
运行结果：
姓名为:张三,工号为:9527,工资为:10000.0,的程序员正在编写代码
姓名为:李四,工号为:9528,工资为:15000.0,奖金为:2000.0,的项目经理正在管理程序员写代码
 */
public class Test {
    public static void main(String[] args) {
        Coder coder = new Coder("张三", "9527", 10000.0);
        Manager manager = new Manager("李四", "9528", 15000.0, 200.0);
        coder.work();
        manager.work();
    }


}
