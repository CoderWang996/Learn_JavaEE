//定义一个接口
interface jumpAble{
    void jump();
}
//定义接口的实现类
class Rabbit implements jumpAble{
    //重写jump方法
    public void jump() {
        System.out.println("小兔子会跳高！");
    }
}
//定义操作类
class JumpOperator{
    //接口名作为方法的形参，其实需要的是该接口的实现类
    public void useJump(jumpAble jumpAble){
        jumpAble.jump();
    }
    //接口名作为方法的返回值，其实需要的是该接口的实现类
    public jumpAble get(){
        jumpAble jumpAble=new Rabbit();
        return jumpAble;
    }
}
public class Demo3 {
    public static void main(String[] args) {
        JumpOperator jumpOperator = new JumpOperator();
        jumpAble jumpAble = jumpOperator.get();
        jumpAble.jump();


        jumpOperator.useJump(new Rabbit());
    }
}
