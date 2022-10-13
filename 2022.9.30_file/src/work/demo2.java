package work;

import java.io.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-09
 * Time: 17:31
 */
public class demo2 {
    public static void main(String[] args) {
        //文件的复制
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入源文件");
        File srcFile = new File(scanner.next());
        if (!srcFile.isFile()) {
            System.out.println("输入的源文件有误");
            return;
        }
        System.out.println("请输入目标文件");
        File destFile = new File(scanner.next());
        if (!destFile.getParentFile().isDirectory()) {
            System.out.println("输入的目标文件有误");
            return;
        }
        //打开源文件
        try(InputStream inputStream = new FileInputStream(srcFile);
            OutputStream outputStream = new FileOutputStream(destFile)){
            while (true) {
                int ret = inputStream.read();
                if (ret == -1) {
                    break;
                }
                outputStream.write(ret);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
