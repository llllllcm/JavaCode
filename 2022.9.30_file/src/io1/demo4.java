package io1;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-06
 * Time: 20:46
 */
public class demo4 {
    public static void main(String[] args) {
        File f = new File("./testDir");
        //mkdir是 make directory的缩写
        f.mkdir();
    }
}
