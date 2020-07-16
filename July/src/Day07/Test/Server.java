package Day07.Test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10001);
        while (true){
            Socket s=ss.accept();
            new Thread(new CopyJPG(s)).start();
        }
    }
}
