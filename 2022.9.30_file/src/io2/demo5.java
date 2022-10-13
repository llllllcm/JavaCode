package io2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-08
 * Time: 11:15
 */
public class demo5 {
//    public static void main(String[] args) throws IOException {
//        //针对写文本文件来说，可以使用PrintWriter来简化代码
//        OutputStream outputStream = null;
//        try {
//            outputStream = new FileOutputStream("./bbb.txt");
//            PrintWriter writer = new PrintWriter(outputStream);
//            writer.println();
//            writer.println(2);
//            writer.printf("a = %d",10);
//        }finally {
//            outputStream.close();
//        }
//    }
    public static void main(String[] args) throws IOException {
        //针对写文本文件来说，可以使用PrintWriter来简化代码
        //利用try with resources 把关闭的对象写到try()里，当try结束，就会自动的调用
        //到对应对象的close方法，而且支持一个()放多个对象，多个对象的创建之间的使用，使用;分割就行
        try(OutputStream outputStream = new FileOutputStream("./bbb.txt")) {
            PrintWriter writer = new PrintWriter(outputStream);
            writer.println();
            writer.println(2);
            writer.printf("a = %d",10);
        }
    }
}
