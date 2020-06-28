package cn.itcast.Day07.interface3;

public class PingpangCoach extends Coach {
    @Override
    public void teach() {
        System.out.println("乒乓球教练教运动员打乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃大白菜");
    }

    public PingpangCoach() {
    }

    public PingpangCoach(int AGE, String NAME) {
        super(AGE, NAME);
    }
}
