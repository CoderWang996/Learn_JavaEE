package cn.itcast.Day15.IOStreamRW;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("hello");
        arr.add("java");
        BufferedWriter bw=new BufferedWriter(new FileWriter("ITheima\\nee.txt"));
        for (String s : arr) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
