package io2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-08
 * Time: 11:02
 */
public class demo4 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("./bbb.txt");
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        inputStream.close();
    }
}
