package io2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-08
 * Time: 10:53
 */
public class demo3 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("./bbb.txt");
        writer.write("hello jay");
        writer.close();
    }
}
