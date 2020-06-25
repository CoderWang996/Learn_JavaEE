package 作业四;
//我女朋友叫凤姐,身高155.0厘米,体重130.0斤 女朋友帮我洗衣服 女朋友给我做饭
public class girlFriendTest {
    public static void main(String[] args) {
        girlFriend g1=new girlFriend();
        g1.setName("Tina");
        g1.setHeight(170.0);
        g1.setWeight(110.6);
        g1.show();
        g1.wash();
        g1.cook();
        System.out.println();
        girlFriend g2=new girlFriend("盛杰",165.0,118.0);
        g2.show();
        g2.wash();
        g2.cook();
    }
}
