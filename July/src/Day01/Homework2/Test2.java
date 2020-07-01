package Day01.Homework2;

        import java.util.Arrays;

/*
【编号2202】请观察如下代码，其实现的效果是将数组中的元素按照从大到小的顺序排序：
public class Test {
    public static void main(String[] args) {
        Integer[] arr = {2, 4, 6, 1, 9, 3, 0, 7};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2.compareTo(i1);
            }
        });
        System.out.println(Arrays.toString(arr));
	}
}
请使用Lambda表达式，改写以上代码，实现相同的需求。
 */
public class Test2 {
    public static void main(String[] args) {
        Integer[] arr = {2, 4, 6, 1, 9, 3, 0, 7};
        Arrays.sort(arr,(i1,i2)->i2.compareTo(i1));
        System.out.println(Arrays.toString(arr));
    }
}

