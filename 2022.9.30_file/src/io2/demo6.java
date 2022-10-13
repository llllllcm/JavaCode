package io2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-08
 * Time: 13:33
 */
public class demo6 {
    public static void main(String[] args) throws IOException {
        //1.让用户输入必要的信息
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要扫描的路径：");
        File rootDir = new File(scanner.next());
        if (!rootDir.isDirectory()) {
            System.out.println("你输入的目录不存在");
            return;
        }
        System.out.println("请输入要搜索的关键词：");
        String toDelete = scanner.next();
        //2，遍历目录，需要借助一个核心方法，
        //listFiles()——能够把当前目录里的文件和子目录列举出来
        //但是有个弊端，无法把子目录里的子目录列举出来。
        scanDir(rootDir,toDelete);
    }
    static void scanDir(File rootDir, String toDelete) throws IOException {
        System.out.println("当前访问："+rootDir.getCanonicalPath());
        File[] files = rootDir.listFiles();
        if (files == null ) {
            //说明 rootDir是一个空的目录
            return;
        }
        for (File f: files) {
            if (f.isDirectory()) {
                //递归的调用
                scanDir(f,toDelete);
            }else {
                //不是目录，是文件的话，判断文件是否符合要求。
                checkDelete(f,toDelete);
            }
        }
    }

    private static void checkDelete(File f, String toDelete) throws IOException {
        if (f.getName().contains(toDelete)) {
            System.out.println("该单词"+toDelete+"被"+f.getCanonicalPath()+"是否要删除?(Y/N)");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();
            if (choice.equals("Y") || choice.equals("y")) {
                f.delete();
            }
            //如果不是则不删除。
        }
    }
}
