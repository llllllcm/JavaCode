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
 * Date: 2022-11-19
 * Time: 13:58
 */
public class TcpEchoClient {
    private Socket socket = null;

    public TcpEchoClient(String serverIP,int serverPort) throws IOException {
        socket = new Socket(serverIP,serverPort);
    }
    public void start() {
        Scanner scanner = new Scanner(System.in);
        try(InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream()) {
            while(true) {
                //1.从控制台读取一个数据构造成请求发送给服务器
                System.out.print("->");
                String request = scanner.next();
                //2.发送请求给服务器
                PrintWriter printWriter = new PrintWriter(outputStream);
                printWriter.println(request);
                printWriter.flush();
                //3.从服务器读取响应
                Scanner respScanner = new Scanner(inputStream);
                String response = respScanner.next();
                //4.把响应显示到界面上
                System.out.println(response);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        TcpEchoClient tcpEchoClient = new TcpEchoClient("127.0.0.1",9090);
        tcpEchoClient.start();
    }
}
