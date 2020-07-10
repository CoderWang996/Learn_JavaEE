package Day05.Review3;

import java.io.*;

//将当前模块下的Day05\\Review1\\Demo1复制到当前模块下的copy.java BufferedWR版本
public class Demo3_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("July\\src\\Day05\\Review1\\Demo1.java"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("July\\copy.java"));
        char []chars=new char[1024];
        int len;
        while ((len=br.read(chars))!=-1){
            bw.write(chars,0,len);
        }
        bw.close();
        br.close();
    }
}
