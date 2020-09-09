package Code2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/*
 * 编写程序，打开一篇英文文章（存在当前目录下的文件in.txt中），
 * 为该文章生成词汇表（存到当前目录下的另一个文件words.txt中）。
 * 文章中单词指的是只由小写或大写字母组成的字符串，
 * 但词汇表中的单词都是以小写字母的形式出现，
 * 若文章中出现多个大小写无关的相同单词，
 * 只在词汇表中生成一个单词。假设生成的词汇表中单词个数不会超过100个，
 * 且每个单词的长度不会超过20。词汇表中的单词以字典顺序由小到大存放。*/
public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src\\Code2\\in.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("src\\Code2\\words.txt"));
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        String line = null;
        while ((line = reader.readLine()) != null) {
            String[] array = line.toLowerCase().split(" ");
            for (String s : array) {
                set.add(s);
            }
        }
        for (String s : set) {
            list.add(s);
        }
        Collections.sort(list);
        for (String s : list) {
            writer.write(s);
            writer.newLine();
            writer.flush();
        }
        writer.close();
        reader.close();
    }
}
