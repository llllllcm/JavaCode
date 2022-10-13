package io2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-08
 * Time: 15:57
 */
public class demo8 {
    public static void main(String[] args) throws IOException {
        //1.输入路径和要插入的关键词
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要扫描的路径");
        File rootDir = new File(scanner.next());
        System.out.println("请输入要查询的词： ");
        String toFind = scanner.next();
        //2.递归的扫描目录
        scanDir(rootDir,toFind);
    }

    private static void scanDir(File rootDir, String toFind) throws IOException {
        File[] files = rootDir.listFiles();
        if (files == null) {
            return;
        }
        for (File f: files) {
            if (f.isDirectory()) {
                scanDir(f,toFind);
            } else {
               checkFile(f,toFind);
            }

        }
    }

    private static void checkFile(File f, String toFind) throws IOException {
        //1，先检查文件名
        if (f.getName().contains(toFind)) {
            System.out.println(f.getCanonicalPath() + "文件名中包含" + toFind);
        }
        //2.检查文件内容
        try(InputStream inputStream = new FileInputStream(f)) {
            StringBuilder stringBuilder = new StringBuilder();
            Scanner scanner = new Scanner(inputStream);
            //需要按行读取
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine()+"\n");
            }
            if (stringBuilder.indexOf(toFind) > -1) {
                System.out.println(f.getCanonicalPath() + "文件内容包含" + toFind);
            }
        }
    }
}
