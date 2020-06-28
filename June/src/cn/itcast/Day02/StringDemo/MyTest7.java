package cn.itcast.Day02.StringDemo;
/*
    关于String的常用方法演示
        boolean contains​(CharSequence s) : 判断当前字符串对象中是否包含指定的内容

        boolean endsWith​(String suffix):  测试此字符串是否以指定的后缀结尾。
        boolean startsWith​(String prefix) 测试此字符串是否以指定的前缀开头。

        String[] split​(String regex) : 通过指定内容切割当前字符串,返回字符串数组
        String replace​(String oldChar, String newChar) 返回从替换所有出现的导致一个字符串 oldChar ，在这个字符串 newChar 。

        String substring​(int beginIndex) : 理解为截肢方法,从指定索引位置开始截取,截取到最后,包含起始索引内容
        String substring​(int beginIndex, int endIndex) 返回一个字符串，该字符串是此字符串的子字符串。含头不含尾
        int indexOf​(String str) 返回指定子字符串第一次出现的字符串内的索引。
 */
public class MyTest7 {
    public static void main(String[] args) {
        String s="你是猪吗？你怎么这么笨且懒！";
        System.out.println(s.contains("猪"));
        System.out.println(s.endsWith("猪"));
        System.out.println(s.endsWith("懒！"));
        System.out.println(s.startsWith("你是"));
        String []split =s.split("吗");
        System.out.println(split[0]);
        System.out.println(split[1]);
        String s2=s.replace("猪","*").replaceAll("懒","X");
        System.out.println(s2);
        String str="今天简直日了狗";
        String str1=str.substring(str.indexOf("狗"));
        System.out.println(str1);
        String str2=str.substring(str.indexOf("日"),str.indexOf("狗"));
        System.out.println(str2);
    }
}
