package io2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-08
 * Time: 10:44
 */
public class demo2 {
    public static void main(String[] args) throws IOException {
        //使用字符流读文件
        Reader reader = new FileReader("./bbb.txt");
        while(true) {
            int ret = reader.read();
            if (ret == -1) {
                break;
            }
            char ch = (char)ret;
            System.out.println(ch);
        }
        reader.close();
    }
}
