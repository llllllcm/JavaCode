import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-05
 * Time: 15:12
 */
public class UdpEchoServer {
    private DatagramSocket socket = null;
//参数的端口表示服务器要绑定的端口
    public UdpEchoServer(int port) throws SocketException {
        socket = new DatagramSocket(port);
    }
    //通过这个方法启动服务器
    public void start() throws IOException {
        System.out.println("服务器启动");
        //这里使用while循环的原因是因为，服务器不知道客户端什么时候发送请求，所以需要严阵以待。
        while(true) {
            //循环里面处理一次请求
            // 1. 读取请求
            //这里的字节数组大小可任意。
            DatagramPacket requestPacket = new DatagramPacket(new byte[4096],4096);
            //需要注意的是这里receive方法的参数，是个输出型参数，调用receive的时候，需要手动的传入一个空的
            //DatagramPacket 对象，然后把对象交给receive，在receive里面负责把从网卡读到的数据，给填充到这个对象中。
            socket.receive(requestPacket);
            //把这个DatagramPacket 对象转成字符串，方便去打印
            String request = new String(requestPacket.getData(),0, requestPacket.getLength());
            // 2. 根据请求计算响应
            String response = process(request);
            // 3. 把响应写到客户端
            //还需在文件上写上客户端的数据才行，于是加上了requestPacket.getSocketAddress()
            DatagramPacket responsePacket = new DatagramPacket(response.getBytes(),response.getBytes().length,
                    requestPacket.getSocketAddress());
            socket.send(responsePacket);

            // 4. 打印一个日志，记录当前的情况
            //requestPacket.getAddress().toString()客户端的端口号，客户端的IP地址：requestPacket.getPort()
            System.out.printf("[%s:%d] req: %s; resp: %s\n",requestPacket.getAddress().toString(),
                    requestPacket.getPort(),request,response);

        }
    }
    //当前写的是一个回显服务器响应数据和请求是一样的
    public String process(String request) {
        return request;
    }

    public static void main(String[] args) throws IOException {
        UdpEchoServer server = new UdpEchoServer(9090);
        server.start();
    }
}
