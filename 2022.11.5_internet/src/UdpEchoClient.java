import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-10
 * Time: 20:09
 */
public class UdpEchoClient {
    private DatagramSocket socket = null;
    private String serverIP;
    private int serverPort;

    //两个参数一会会在发送数据的时候用到，这里先存起来
    public UdpEchoClient(String serverIP, int serverPort) throws SocketException {
        //这里并不是说没有端口，而是让系统自动指定一个空闲的端口，因为如果是指定端口的话，可能会存在端口
        //已经被占用的情况
        socket = new DatagramSocket();
        this.serverIP = serverIP;
        this.serverPort = serverPort;
    }

    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            // 1. 从控制台读取用户输入的内容
            System.out.print("->");
            String request = scanner.next();
            // 2. 构造一个UDP请求，发送给服务器
            DatagramPacket requestPacket = new DatagramPacket(request.getBytes(),request.getBytes().length,
                    InetAddress.getByName(this.serverIP),this.serverPort);
            socket.send(requestPacket);
            // 3. 从服务器读取UDP响应数据，并解析
            DatagramPacket responsePacket = new DatagramPacket(new byte[4096],4096);
            socket.receive(responsePacket);
            String response = new String(responsePacket.getData(),0,responsePacket.getLength());
            // 4. 把响应请求打印在控制台上
            System.out.println(response);
        }

    }

    public static void main(String[] args) throws IOException {
        UdpEchoClient client = new UdpEchoClient("127.0.0.1",9090);
        client.start();
    }

}
