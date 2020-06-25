package homework9;
/*
运行结果
品牌：大米,价格：2000.0,尺寸：6
打电话
视频通话
发短信
 */
public class Demo8 {
    public static void main(String[] args) {
        SmartPhone o = new SmartPhone("大米",2000);
        System.out.println("品牌：" +o.getBrand() + ",价格：" +o.getPrice()+ ",尺寸：" +o.size);
        o.call();
        o.sendMessage();
    }
}