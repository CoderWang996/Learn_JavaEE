package 继承五;
class Phone{
    public void Call(String name){
        System.out.println("打电话给"+name);
    }
}
class NewPhone extends Phone{
    //Ctrl+O快捷键
    @Override
    public void Call(String name) {
        System.out.println("打视频电话");
        super.Call(name);
    }
}
public class demo {
    public static void main(String[] args) {
        NewPhone np=new NewPhone();
        np.Call("老总");
    }
}
