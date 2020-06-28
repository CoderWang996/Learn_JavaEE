package cn.itcast.Day17.Homework11;
        import org.apache.commons.io.FileUtils;
        import java.io.*;

/*
【编号1903】在子类重写（Override）父类或者父接口的方法时，
有两个注意事项：一是子类方法不能比父类方法的访问权限更小，
二是子类方法不能抛出比父类方法更多的异常。所以如果IO流的读写操作出现在子类重写的方法中，
而父类方法没有抛出异常时，就需要将异常进行捕获处理。
请定义一个方法实现，给出文件的数据源和拷贝目的地（均为字符串类型），能够完成文件的拷贝，并且方法不能抛出异常。
 */
public class Test11 {
    public static void main(String[] args) {
        copyFile("D:\\TestFile\\abc\\ojbk.txt","D:");
    }
    public static void copyFile(String f1,String f2){
        try{
            File file1=new File(f1);
            String f1Name=file1.getName();
            File file2=new File(f2,f1Name);
            FileUtils.copyFile(file1,file2);
        }catch (Exception e){

        }
    }
}
