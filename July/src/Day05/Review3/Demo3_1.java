package Day05.Review3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//将当前模块下的Day05\\Review1\\Demo1复制到当前模块下的copy.java FileWR版本
public class Demo3_1 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("July\\src\\Day05\\Review1\\Demo1.java");
        FileWriter fw=new FileWriter("July\\copy.java");
        char []chars=new char[1024];
        int len;
        while ((len=fr.read(chars))!=-1){
            fw.write(chars,0,len);
        }
        fw.close();
        fr.close();
    }
}
