package io1;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-06
 * Time: 20:31
 */
public class demo3 {
    public static void main(String[] args) {
        File f = new File("./test.txt");
        f.delete();
    }
}
