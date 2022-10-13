package io1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-08
 * Time: 9:41
 */
public class demo7 {
    public static void main(String[] args) throws IOException {
        //打开文件
        InputStream inputStream = new FileInputStream("./bbb.txt");
        while (true) {
            int a = inputStream.read();
            //因为读完了返回-1，所以这里判断，如果是-1则跳出循环
            if (a == -1) {
                break;
            }
            System.out.println(a);
        }
        inputStream.close();
    }
}
