package Day06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fi=new FileInputStream("July\\Test.txt");
        FileOutputStream fo=new FileOutputStream("July\\CTest.txt");
        int temp;
        while ( (temp=fi.read())!=-1){
            System.out.println(temp);
        }
        fo.close();
        fi.close();
    }
}
