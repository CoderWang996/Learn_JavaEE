package cn.itcast.Day15.IOStreamRW;

import java.io.*;

public class Demo5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("ITheima\\copyMe.java"));
        BufferedWriter rw=new BufferedWriter(new FileWriter("ITheima\\copy.txt"));
        String line;
        while ((line=br.readLine())!=null){
            rw.write(line);
            rw.newLine();
            rw.flush();
        }
        rw.close();
        br.close();
    }
}
