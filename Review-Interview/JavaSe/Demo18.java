/*
* 10、下列程序的执行结果是（  ）

int num = 17;

while(num>0)

{
 System.out.print(num ++ %5 + “\t”);

 num /=5;

}*/
public class Demo18 {
    public static void main(String[] args) {
        int num = 17;

        while(num>0)

        {
            //++在后则后执行
            System.out.print(num++  %5 + "\t");
            System.out.println("此时num的值为："+num);
            num /=5;

        }


    }
}
