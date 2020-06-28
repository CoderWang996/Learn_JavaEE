package cn.itcast.Day17.Homework12;

import java.io.*;
/*
【编号1904】在D盘根目录下，有一个“iotest.txt”文件（直接准备好即可），文件内容如下：
InputStream
FileInputStream
BufferedInputStream
OutPutStream
FileOutPutStream
BufferedOutPutStream
...
请编写程序，使用打印流将该文件拷贝到当前模块目录下，要求给每行的数据都增加一个行号（从1开始），
并且需要实现自动刷新。目标文件中的内容如下（符号均为英文格式）：
1: InputStream
2: FileInputStream
3: BufferedInputStream
4: OutPutStream
5: FileOutPutStream
6: BufferedOutPutStream
...
 */
public class Test12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("D:\\iotest.txt"));
        PrintWriter pw=new PrintWriter(new FileWriter("ITheima\\iotest.txt"),true);
        String line;
        int i=1;
        while ((line=br.readLine())!=null){
            pw.println(i+": "+line);
            i++;
        }
        pw.close();
        br.close();
    }
}
