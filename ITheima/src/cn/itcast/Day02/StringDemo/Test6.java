package StringDemo;

public class Test6 {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3};
        System.out.println(Reverse(arr));
    }
    public static String Reverse(int []arr){
        String s="";
        s+="[";
        for (int i = arr.length-1;i>=0;i--) {
            if(i==0){
                s+=arr[i];
            }else {
            s+=arr[i];
            s+=", ";
        }
        }
        s+="]";
        return s;
    }
}
