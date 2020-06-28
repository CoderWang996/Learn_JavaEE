package cn.itcast.Day15.IOStreamRW;

import java.io.*;
import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("ITheima\\copy.txt"));
        ArrayList<String> arrayList=new ArrayList<>();
        String line;
        while ((line=br.readLine())!=null){
            arrayList.add(line);
        }
        br.close();
        for (String s : arrayList) {
            System.out.println(s.toString());
        }
    }
}
