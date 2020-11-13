import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//集合
public class Demo8 {
    public static void main(String[] args) {
        //创建一个List集合
        ArrayList<String> list = new ArrayList<String>();
        list.add("张三");
        list.add("23");
        list.add("合肥");
        Iterator<String> iterator = list.iterator();
/*        while (iterator.hasNext()){
            String next = iterator.next();
            //Exception in thread "main" java.util.ConcurrentModificationException
            if (next.contains("23")){
                list.add("45");
            }
        }
          for (String s : list) {
            //Exception in thread "main" java.util.ConcurrentModificationException
            if (s.contains("张三")){
                list.add("李四");
            }
        }
         ListIterator<String> iterator2 = list.listIterator();
        while (iterator2.hasNext()){
            if (iterator2.next().contains("23")){
                list.add("Java大牛！");
            }
        }
        System.out.println(list);
        */
        /*
         * 注意：使用普通的迭代器和list特有的迭代器listIterator遍历List集合，如果在遍历过程中通过集合对象对集合元素进行了修改
         * 都会发生并发修改异常！！！
         * 增强for循环和普通迭代器一样，也会发生并发修改异常！
         *
         * */
        //解决方案，使用普通for循环遍历：
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("张三")){
                list.add("666");
            }
        }
        System.out.println("好使！");
        System.out.println(list);
    }
}
