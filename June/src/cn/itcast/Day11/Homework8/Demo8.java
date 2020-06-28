package cn.itcast.Day11.Homework8;

import java.util.ArrayList;
import java.util.Random;

/*
【编号：1408】2016年里约热内卢奥运会足球比赛，共有16只球队参赛，
分别是巴西、阿根廷、丹麦、德国、葡萄牙、瑞典、斐济、洪都拉斯、墨西哥、阿尔及利亚、
尼日利亚、南非、伊拉克、日本、韩国、哥伦比亚。
请使用所学集合知识，编写程序把这16支球队随机分成四组，输出结果如下：
第1组：
哥伦比亚 韩国 伊拉克 葡萄牙
第2组：
阿尔及利亚 南非 斐济 尼日利亚
第3组：
阿根廷 墨西哥 日本 洪都拉斯
第4组：
瑞典 丹麦 德国 巴西
 */
public class Demo8 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        Random r = new Random();
        a.add("巴西");
        a.add("阿根廷");
        a.add("丹麦");
        a.add("德国");
        a.add("葡萄牙");
        a.add("瑞典");
        a.add("斐济");
        a.add("洪都拉斯");
        a.add("墨西哥");
        a.add("阿尔及利亚");
        a.add("尼日利亚");
        a.add("南非");
        a.add("伊拉克");
        a.add("日本");
        a.add("韩国");
        a.add("哥伦比亚");
        //外循环从1到四表示有1-4组
        for (int i = 1; i <= 4; i++) {
            System.out.println("第" + i + "组：");
            //内循环必须倒着遍历，因为remove一次List的长度就减1
            //到最后一组时List的长度为4最大索引为3
            for (int j = 3; j >= 0; j--) {
                int index = r.nextInt();
                System.out.print(a.get(j) + " ");
                a.remove(j);
            }
            System.out.println();
        }
    }
}