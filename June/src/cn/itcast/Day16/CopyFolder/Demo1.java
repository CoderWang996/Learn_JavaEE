package cn.itcast.Day16.CopyFolder;
import java.io.*;

public class Demo1 {
    public static void main(String[] args)throws IOException {
        File f1=new File("D:\\Copyme");
        String f1Name=f1.getName();
        File f2=new File("ITheima",f1Name);
        if (!f2.exists()){
            f2.mkdir();
        }
        File []files=f1.listFiles();
        for (File file : files) {
            String name1=file.getName();
            File ff2=new File(f2,name1);
            copyFile(file,ff2);
        }
    }

    private static void copyFile(File file, File ff2) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(ff2));
        byte []bys=new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();
    }
}
