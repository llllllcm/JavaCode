package io2;

import java.io.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-08
 * Time: 15:01
 */
public class demo7 {
    public static void main(String[] args) {
        //文件的复制
        //1.先输入要复制的文件以及把这个文件复制到哪去
        //2.打开源文件，按照字节读取内容，再依次写入目标文件中
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入源文件");
        //因为要判断文件是否存在，所以用File
        File srcFile = new File(scanner.next());
        System.out.println("请输入目标文件");
        File destFile = new File(scanner.next());
        if (!srcFile.isFile()) {
            System.out.println("输入的源文件有误");
            return;
        }
        if (!destFile.getParentFile().isDirectory()) {
            System.out.println("输入的目标文件有误");
            return;
        }
        //打开源文件
        try(InputStream inputStream = new FileInputStream(srcFile);
            OutputStream outputStream = new FileOutputStream(destFile)) {
            while (true) {
                int ret = inputStream.read();
                if (ret == -1 ) {
                    break;
                }
                outputStream.write(ret);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
