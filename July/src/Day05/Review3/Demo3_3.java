package Day05.Review3;

import java.io.*;
//将当前模块下的Day05\\Review1\\Demo1复制到当前模块下的copy.java BufferedWR版本(特有方法readLine+newLine+flush方法)
public class Demo3_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("July\\src\\Day05\\Review1\\Demo1.java"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("July\\copy.java"));
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
