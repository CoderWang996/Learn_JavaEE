package homework6;
/*
运行结果
张三老师...23
基础班老师讲JavaSE
李四老师...24
就业班老师讲JavaEE
 */
public class Demo {
    public static void main(String[] args) {
        BaseTeacher bt=new BaseTeacher("张三老师",23);
        WorkTeacher wt=new WorkTeacher("李四老师",24);
        System.out.println(bt.getName()+"..."+bt.getAge());
        bt.teach();
        System.out.println(wt.getName()+"..."+wt.getAge());
        wt.teach();
    }
}
