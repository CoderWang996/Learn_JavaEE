package Day01Code.NewPhone;

public class Phone {
    String brand;
    int price;
    int neicun;
    public void call(){
        System.out.println("它可以打电话");
    }
    public void sendMessage(){
        System.out.println("他可以发短信");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNeicun(int neicun) {
        this.neicun = neicun;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public int getNeicun() {
        return neicun;
    }
    public void show(){
        System.out.println(brand+","+price+"元"+","+neicun+"G");
    }
}