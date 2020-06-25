package homework6;
/*
分析事物的共性，并抽取出正确的继承体系 现有基础班老师（BaseTeacher）和就业班老师（WorkTeacher）两个类，两者都含有姓名和年龄两个属性，
还有一个讲课的行为teach，但不同的是，基础班老师的teach方法输出【基础班老师讲JavaSE】，
就业班老师的teach方法输出【就业班老师讲JavaEE】，请用代码实现。 运行结果：
张三老师...23
基础班老师讲JavaSE
李四老师...24
就业班老师讲JavaEE
 */
public class WorkTeacher extends BaseTeacher{
    public WorkTeacher(){
        super();
    }
    public WorkTeacher(String name,int age){
        super(name,age);
    }
    @Override
    public void teach(){
        System.out.println("就业班老师讲JavaEE");
    }
}
