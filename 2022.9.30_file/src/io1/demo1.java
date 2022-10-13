package io1;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-30
 * Time: 9:35
 */
public class demo1 {
    public static void main(String[] args) throws IOException {
//        File f = new File("D:/test.txt");
        File f = new File("./test.txt");
        System.out.println(f.getParent());
        System.out.println(f.getName());
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getCanonicalPath());
    }
}
