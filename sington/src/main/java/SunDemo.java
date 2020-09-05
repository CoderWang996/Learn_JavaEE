public class SunDemo {
    public static void main(String[] args) {
        Sun sun1 = Sun.getInstance();
        Sun sun2 = Sun.getInstance();
        System.out.println(sun1==sun2);
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(car1==car2);
    }
}
