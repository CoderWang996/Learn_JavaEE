package homework7;
/*
结合继承的思想，分析下列需求并实现
定义项目经理类Manager 【属性：姓名 工号 工资 奖金】【行为：工作work】
定义程序员类Coder【属性：姓名 工号 工资】【行为：工作work】
要求：通过有参构造创建两个类的对象，并调用各自的work方法
 */
public class Manager extends Coder{
   private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(){
       super();
   }

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }
    //姓名为:李四,工号为:9528,工资为:15000.0,奖金为:2000.0,的项目经理正在管理程序员写代码
    @Override
    public void work(){
        System.out.println("姓名为:"+name+",工号为:"+id+",工资为:"+salary+",奖金为:"+bonus+",的项目经理正在管理程序员写代码");
    }
}
