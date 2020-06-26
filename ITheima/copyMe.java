public class Demo {
    public static void main(String[] args) throws IOException {
        File f=new File("ITheima\\myf.txt");
        f.createNewFile();
        OutputStreamWriter osw= new OutputStreamWriter(new FileOutputStream("ITheima\\myf.txt"),"GBK");
        osw.write("我是中国人");
        osw.close();
        InputStreamReader isr=new InputStreamReader(new FileInputStream("ITheima\\myf.txt"),"GBK");
        int by;
        while ((by=isr.read())!=-1){
            System.out.print((char)by);
        }
        isr.close();
    }
}
