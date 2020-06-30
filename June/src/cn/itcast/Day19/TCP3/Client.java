package cn.itcast.Day19.TCP3;

        import java.io.*;
        import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("www.CoderWang.com",10001);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line=br.readLine())!=null){
            if("886".equals(line)){
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.close();
    }
}
