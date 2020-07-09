package Day04.Review1;

import java.util.ArrayList;
import java.util.Collections;

/*
案例需求
有一个字符串：“91 27 46 38 50”，请写程序实现最终输出结果是：“27 38 46 50 91”
 */
public class Demo1 {
    public static void main(String[] args) {
        String s="91 27 46 38 50";
        String []arr=s.split(" ");
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (String s1 : arr) {
            arrayList.add(Integer.parseInt(s1));
        }
        Collections.sort(arrayList);
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            if (i==arrayList.size()-1){
                sb.append(arrayList.get(i));
            }else {
                sb.append(arrayList.get(i)).append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
