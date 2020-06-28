package cn.itcast.Day07.interface3;

public class basketballCoach extends Coach {
    @Override
    public void teach() {
        System.out.println("篮球教练教运动员打篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃小菠菜");
    }

    public basketballCoach() {
    }

    public basketballCoach(int AGE, String NAME) {
        super(AGE, NAME);
    }
}
