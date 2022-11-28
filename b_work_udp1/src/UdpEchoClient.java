import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-16
 * Time: 21:01
 */
public class UdpEchoClient {
    private DatagramSocket socket = null;
    private String serverIp;
    private int serverPort;
    //这里只是先存储起来端口号和IP地址，后续会使用到，这里的端口号无需指定，等待系统分配（否则会出现当前端口被其他程序占用的情况）
    public UdpEchoClient(String serverIp,int serverPort) throws SocketException {
        socket = new DatagramSocket();
        this.serverPort = serverPort;
        this.serverIp = serverIp;
    }
    private void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        //因为是长连接，所以需要while循环
        while(true) {
            //1.从控制台读取用户输入的内容
            System.out.print("->");
            String request = scanner.next();
            //2.构造一个UDP请求发送给服务器
            DatagramPacket requestPacket = new DatagramPacket(request.getBytes(),request.getBytes().length,
                    InetAddress.getByName(this.serverIp),this.serverPort);
            socket.send(requestPacket);
            //3.从服务器读取响应，并解析
            DatagramPacket responsePacket = new DatagramPacket(new byte[4096],4096);
            socket.receive(responsePacket);
            String response = new String(responsePacket.getData(),0,responsePacket.getLength());
            //4.把请求打印到控制台上
            System.out.println(response);
        }
    }

    public static void main(String[] args) throws IOException {
        UdpEchoClient udpEchoClient = new UdpEchoClient("127.0.0.1",9090);
        udpEchoClient.start();
    }

}
