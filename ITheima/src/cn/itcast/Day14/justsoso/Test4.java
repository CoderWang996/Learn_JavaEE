package cn.itcast.Day14.justsoso;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;

/*
按照下面的描述操作Map集合
实例化一个Map接口的实现类，其key和value均为整数
循环产生100个随机的0-9之间的整数，以该数为key存放到map中，
如果map中未包含该数字，则第一次存放进去时的value值为1，若已经存在该数字，
则value值加1（也就是value是key出现的次数）
遍历该Map集合，输出每个数字产生的次数（最终次数之和应该为100）
 */
public class Test4 {
    public static void main(String[] args) {
        //实例化一个Map接口的实现类，其key和value均为整数
        HashMap<Integer,Integer> hm=new HashMap<>();
        Random r=new Random();
        //循环产生100个随机的0-9之间的整数，以该数为key存放到map中，
        for (int i = 0; i < 100; i++) {
            Integer key=r.nextInt(10);//随机产生[0-10)之间的整数作为key
            Integer value=hm.get(key);
            //第一次存放进去时的value值为1，若已经存在该数字，则value值加1
            if(value==null){
                value=1;
                hm.put(key,value);
            }else {
                value++;
                hm.put(key,value);
            }
        }
        //遍历该Map集合，输出每个数字产生的次数
        Set<Integer> keys = hm.keySet();
        int sum=0;
        for (Integer key : keys) {
            sum+=hm.get(key);
            System.out.println(key+"出现的次数是："+hm.get(key));
            System.out.println("次数之和为："+sum);
        }
    }
}
