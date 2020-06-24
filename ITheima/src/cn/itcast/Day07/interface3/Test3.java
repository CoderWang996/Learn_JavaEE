package cn.itcast.Day07.interface3;

public class Test3 {
    public static void main(String[] args) {
        basketballCoach bc=new basketballCoach(22,"呆头");
        BasketballPlayer BP=new BasketballPlayer(22, "任晨");
        PingpangCoach pc=new PingpangCoach(22,"徐熙");
        PingpangPlayer pp=new PingpangPlayer(21,"王晨阳");
        System.out.println(bc.getNAME()+"   "+bc.getAGE());
        bc.teach();
        bc.eat();
        System.out.println("--------");
        System.out.println(BP.getNAME()+"   "+BP.getAGE());
        BP.study();
        BP.eat();
        BP.learnEnglish();
        System.out.println("--------");
        System.out.println(pc.getNAME()+"   "+pc.getAGE());
        pc.teach();
        pc.eat();
        System.out.println("--------");
        System.out.println(pp.getNAME()+"   "+pp.getAGE());
        pp.study();
        pp.eat();
        pp.learnEnglish();
    }
}
