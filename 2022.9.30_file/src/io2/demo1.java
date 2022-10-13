package io2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-08
 * Time: 10:32
 */
public class demo1 {
    //进行写文件
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("./bbb.txt");
        outputStream.write(97);
        outputStream.write(98);
        outputStream.write(99);
        outputStream.close();
    }
}
