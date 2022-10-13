package io1;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-06
 * Time: 20:15
 */
public class demo2 {
    public static void main(String[] args) throws IOException {
        //由于一些历史原因，/和\都可以在windows系统上使用
        //根据文件路径创建一个新的 File 实例，路径可以是绝对路径或者相对路径
        File f = new File("./test.txt");
        //判断这个文件是否存在，如果不存在，则返回false
        System.out.println(f.exists());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println("====================");
        //把这个文件创造出来。
        f.createNewFile();
        System.out.println(f.exists());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());

    }
}
