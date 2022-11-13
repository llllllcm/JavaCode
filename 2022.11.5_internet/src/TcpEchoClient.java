import sun.security.krb5.SCDynamicStoreConfig;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-13
 * Time: 16:07
 */
public class TcpEchoClient {
    private Socket socket = null;

    public TcpEchoClient(String serverIP,int serverPort) throws IOException {
        // 和服务器建立连接，就需要知道服务器在哪，这里的IP是服务器的IP，而
        //端口则是服务器随机分配的端口
        socket = new Socket(serverIP,serverPort);
    }
    public void start() {
        Scanner scanner = new Scanner(System.in);
        try (InputStream inputStream = socket.getInputStream();
             OutputStream outputStream = socket.getOutputStream()) {
            while(true) {
                // 1. 从控制台读取数据，构造成一个请求
                System.out.print("->");
                String request = scanner.next();
                // 2. 发送请求给服务器
                PrintWriter printWriter = new PrintWriter(outputStream);
                printWriter.println(request);
                printWriter.flush();
                // 3. 从服务器读取响应
                Scanner respScanner = new Scanner(inputStream);
                String response = respScanner.next();
                // 4. 把响应显示到界面上
                System.out.println(response);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        TcpEchoClient client = new TcpEchoClient("127.0.0.1",9090);
        client.start();
    }
}
