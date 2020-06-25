package StringDemo;
/*
    关于String的常用方法演示
        boolean contains​(CharSequence s) : 判断当前字符串对象中是否包含指定的内容

        boolean endsWith​(String suffix):  测试此字符串是否以指定的后缀结尾。
        boolean startsWith​(String prefix) 测试此字符串是否以指定的前缀开头。

        String[] split​(String regex) : 通过指定内容切割当前字符串,返回字符串数组
        String replace​(String oldChar, String newChar) 返回从替换所有出现的导致一个字符串 oldChar ，在这个字符串 newChar 。

        String substring​(int beginIndex) : 理解为截肢方法,从指定索引位置开始截取,截取到最后,包含起始索引内容
        String substring​(int beginIndex, int endIndex) 返回一个字符串，该字符串是此字符串的子字符串。
        int indexOf​(String str) 返回指定子字符串第一次出现的字符串内的索引。
 */
public class Test7 {
    public static void main(String[] args) {
        String str = "you can kill me,you can't fuck me";

        boolean f1 = str.contains("fuck1");
        System.out.println("f1 = " + f1);

        boolean f2 = str.endsWith("me fuck");
        System.out.println("f2 = " + f2);

        boolean f3 = str.startsWith("you");
        System.out.println("f3 = " + f3);

        String[] strArraySplit = str.split("，");
//        System.out.println(strArraySplit[0]);
//        System.out.println(strArraySplit[1]);
//        System.out.println(strArraySplit[2]);

        //敏感词过滤
        String s = "你个大笨蛋,你个大傻蛋,你就是个笨蛋傻蛋综合体";
        //笨蛋,傻蛋要求被过滤掉,以 ** 替换
        String s1 = s.replace("笨蛋", "**").replaceAll("傻蛋","**");
        System.out.println("s1 = " + s1);

        String ss = "人生的快乐有70种,去掉一种,只剩69";
        //int indexOf​(String str) 返回指定内容在当前字符串中第一次出现的索引
        int endIndex = ss.indexOf("种");
        System.out.println("endIndex = " + endIndex);

        //字符串的截肢
//        String ss1 = ss.substring(17);
        String ss1 = ss.substring(ss.length() - 2);
        System.out.println("ss1 = " + ss1);

        String ss2 = ss.substring(ss.indexOf("快"), ss.indexOf("种") + 1);    //含头不含尾, [3,9)
        System.out.println("ss2 = " + ss2);
    }
}
