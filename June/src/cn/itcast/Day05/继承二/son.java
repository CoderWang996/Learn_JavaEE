package 继承二;
//变量就近原则
public class son extends Father{
    private int age=20;
    private int height=180;
    public void show(){
        int age=21;
        int height=175;
        //访问当前方法内的成员变量
        System.out.println(height);
       //访问当前类的成员变量
        System.out.println(this.height);
        //访问父类的成员变量
        System.out.println(super.height);
        //访问父类的私有成员变量
        System.out.println(super.getAge());
    }
}
