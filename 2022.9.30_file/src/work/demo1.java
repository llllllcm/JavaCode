package work;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-09
 * Time: 16:20
 */
public class demo1 {
    //扫描指定目录，并找到名称中包含指定字符的所有普通文件（不包含目录），
    // 并且后续询问用户是否要删除该文件
    public static void main(String[] args) throws IOException {
        //1，让用户输入必要的信息
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要扫描的路径");
        File rootDir = new File(scanner.next());
        if (!rootDir.isDirectory()) {
            System.out.println("你输入的目录不存在");
            return;
        }
        System.out.println("请输入要搜索的关键词:  ");
        String toDelete = scanner.next();
        scanDir(rootDir,toDelete);
    }

    private static void scanDir(File rootDir, String toDelete) throws IOException {
        File[] files = rootDir.listFiles();
        if (files == null) {
            return;
        }
        for (File f : files) {
            if (f.isDirectory()) {
                scanDir(f,toDelete);
            }else {
                checkDelete(f,toDelete);
            }
        }
    }

    private static void checkDelete(File f, String toDelete) throws IOException {
        if (f.getName().contains(toDelete)) {
            System.out.println("该单词"+toDelete+"被"+f.getCanonicalPath()+"是否要删除？(Y/N)");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();
            if (choice.equals("Y") || choice.equals("y")) {
                f.delete();
            }
        }
    }
}
