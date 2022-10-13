package io1;

import java.io.File;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-06
 * Time: 21:33
 */
public class demo6 {
    public static void main(String[] args) {
        File f = new File("./testDir");
        String[] results = f.list();
        System.out.println(Arrays.toString(results));
    }
}
