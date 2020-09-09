package Code1;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        BufferedReader reader = new BufferedReader(new FileReader("src\\Code1\\filein.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("src\\Code1\\fileout.txt"));
        ArrayList<String> list = new ArrayList<>();
        String line = null;
        while ((line = reader.readLine()) != null) {
            String s1=null;
            for (int i = 0; i < line.length(); i++) {
                s1 = subLine(subLine(line, s), s);
            }
            list.add(s1);
        }
        for (String s1 : list) {
            writer.write(s1);
            writer.newLine();
            writer.flush();
        }
        writer.close();
        reader.close();
    }

    public static String subLine(String s1, String s2) {
        String ss1 = s1.toLowerCase();
        String ss2 = s2.toLowerCase();
        if (ss1.contains(ss2)){
            int index = ss1.indexOf(ss2);
            String before = s1.substring(0, index);
            String after = s1.substring(index + s2.length(), s1.length());
            String nLine = before + after;
            return nLine;
        }else {
            return s1;
        }
    }
}
