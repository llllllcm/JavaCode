package io1;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-06
 * Time: 21:20
 */
public class demo5 {
    public static void main(String[] args) {
        //重命名操作
        File srcFile = new File("aaa.txt");
        File destFile = new File("bbb.txt");
        srcFile.renameTo(destFile);
    }
}
