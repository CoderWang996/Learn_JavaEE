import java.util.Arrays;

public class Demo5 {
    public static void main(String[] args) {
        //定义一个乱序的数组
        int[] arr = {23, 32, 44, 11, 22, 35, 10,88,99,77,66,41,89,70};
        System.out.println("排序前：" + Arrays.toString(arr));
        long t1 = System.currentTimeMillis();
        //冒泡排序
        //外层循环，控制每轮比较次数
        for (int i = 0; i < arr.length; i++) {
            //内层循环控制比较多少轮
            // -1是为了避免索引越界，-x是为了调高比较效率
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        long t2 = System.currentTimeMillis();
        long m1 = t2 - t1;
        System.out.println("冒泡排序后：" + Arrays.toString(arr) + "冒泡排序所用的时间为：" + m1 + "毫秒");
        //快速排序：
        int[] arr2 = {23, 32, 44, 11, 22, 35, 10,88,99,77,66,41,89,70};
        long t3 = System.currentTimeMillis();
        quickSort(arr2,0,arr.length-1);
        long t4 = System.currentTimeMillis();
        long m2=t4-t3;
        System.out.println("快速排序后："+Arrays.toString(arr2)+"用时"+m2+"毫秒");
    }

    public static void quickSort(int[] arr, int left, int right) {
        //递归出口：
        if (left>right){
            return;
        }
        //base中存放基准数
        int base=arr[left];
        int i=left,j=right;
        while (i!=j){
            //先从右往左找
            while (i<j&&arr[j]>=base){
                j--;
            }
            //再从左往右找
            while (i<j&&arr[i]<=base){
                i++;
            }
            //如果满足条件，交换位置
            if (i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //基数归位,此时i=j
        arr[left]=arr[i];
        arr[i]=base;
        // 递归，继续向基准的左右两边执行和上面同样的操作
        // i的索引处为上面已确定好的基准值的位置，无需再处理
        //此处i为基数的下标
        quickSort(arr,left,i-1);
        quickSort(arr,i+1,right);
    }
}
