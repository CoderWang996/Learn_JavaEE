package Day06.TCP.Review3;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class SThread implements Runnable{
    private Socket s;
    public SThread(Socket s) {
        this.s=s;
    }

    @Override
    public void run() {
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            UUID uuid=UUID.randomUUID();
            String id=uuid.toString();
            BufferedWriter bw=new BufferedWriter(new FileWriter("July\\C["+id+"].txt"));
            String line;
            while ((line=br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            BufferedWriter bwS=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwS.write("文件已上传");
            bwS.flush();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
