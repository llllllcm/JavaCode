import java.io.File;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        File a = new File("./test.txt");
        System.out.println(a.exists());
        a.createNewFile();
        System.out.println(a.exists());
    }
}
