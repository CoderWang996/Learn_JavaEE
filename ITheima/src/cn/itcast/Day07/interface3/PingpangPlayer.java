package cn.itcast.Day07.interface3;

public class PingpangPlayer extends Player implements StudyEnglish {
    @Override
    public void study() {
        System.out.println("乒乓球运动员学习如何打乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃鸭肉");
    }

    @Override
    public void learnEnglish() {
        System.out.println("学好英语出国");
    }

    public PingpangPlayer() {
    }

    public PingpangPlayer(int AGE, String NAME) {
        super(AGE, NAME);
    }
}
