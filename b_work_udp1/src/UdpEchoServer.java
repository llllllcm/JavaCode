import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-16
 * Time: 20:23
 */
public class UdpEchoServer {
    public DatagramSocket socket = null;
    //参数的端口表示服务器要绑定的端口
    public UdpEchoServer(int port) throws SocketException {
        socket = new DatagramSocket(port);

    }
    //通过这个方法调用服务器
    public void start() throws IOException {
        System.out.println("服务器启动");
        //因为服务器要保持运行状态，等待客户端发来请求。所以使用while循环
        while (true) {
            //1.读取请求
            DatagramPacket requestPacket = new DatagramPacket(new byte[4096],4096);
            socket.receive(requestPacket);
            //把这个DatagramPacket 对象转成字符串，方便去打印。
            String request = new String(requestPacket.getData(),0, requestPacket.getLength());
            //2.根据请求并计算响应
            String response = process(request);
            //3。把响应写回客户端
            DatagramPacket responsePacket = new DatagramPacket(response.getBytes(),response.getBytes().length,
                    requestPacket.getSocketAddress());
            socket.send(responsePacket);
            //4.打印日志
            System.out.printf("[%s:%d] req: %s; resp: %s\n",requestPacket.getAddress().toString(),
                    requestPacket.getPort(),request,response);

        }
    }

    public String process(String request) {
        return request;
    }

    public static void main(String[] args) throws IOException {
        UdpEchoServer udpEchoServer = new UdpEchoServer(9090);
        udpEchoServer.start();
    }

}
