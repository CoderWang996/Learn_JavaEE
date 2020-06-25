package homework9;

public class SmartPhone extends Phone {
    public SmartPhone(){
        super();
    }
    public SmartPhone(String brand,int price){
        super(brand,price);
    }
    //将打电话的功能做进一步增强（视频通话）
    public void call(){
        super.call();
        System.out.println("视频通话");
    }
}
