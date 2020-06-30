package cn.itcast.Day19.Homework3;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class ServerThread implements Runnable {
    private Socket s;
    public ServerThread(Socket s) {
        this.s=s;
    }

    @Override
    public void run() {
        try {
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("June\\"+UUID.randomUUID().toString()+".jpg"));
            BufferedInputStream bis=new BufferedInputStream(s.getInputStream());
            byte []bys=new byte[1024];
            int b;
            while ((b=bis.read(bys))!=-1){
                bos.write(bys,0,b);
                bos.flush();
            }
            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("文件上传成功");
            bwServer.newLine();
            bwServer.flush();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
