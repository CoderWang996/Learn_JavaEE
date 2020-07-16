package Day07.Test;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class CopyJPG implements Runnable{
    private Socket s;
    public CopyJPG(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            BufferedInputStream bis=new BufferedInputStream(s.getInputStream());

            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("July\\"+UUID.randomUUID().toString()+".jpg"));
            byte[] bytes=new byte[2048];
            int len;
            while ((len=bis.read(bytes))!=-1){
                bos.write(bytes,0,len);
            }
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw.write("文件上传成功");
            bw.flush();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

