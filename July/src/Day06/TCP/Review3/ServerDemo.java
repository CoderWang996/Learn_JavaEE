package Day06.TCP.Review3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10001);
        while (true){
            Socket s=ss.accept();
            new Thread(new SThread(s)).start();
        }
    }
}
