import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-13
 * Time: 15:24
 */
public class TcpEchoServer {
    //
    private ServerSocket listenSocket = null;

    public TcpEchoServer(int port) throws IOException {
        listenSocket = new ServerSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动");
        ExecutorService service = Executors.newCachedThreadPool();
        while(true) {
            //1.先调用 accept 来接受客户端的连接
            Socket clientSocket = listenSocket.accept();
            //2.这里的连接，应该实现多线程，也就是每个客户端连接上来的时候，都有一个线程负责处理
//            Thread t = new Thread(()->{
//                try{
//                    procession(clientSocket);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            });
//            t.start();
            service.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        procession(clientSocket);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private void procession(Socket clientSocket) throws IOException {
        System.out.printf("[%s:%d]客户端上线！\n",clientSocket.getInetAddress().toString(),clientSocket.getPort());
        //处理客户信息
        try(InputStream inputStream = clientSocket.getInputStream();
            OutputStream outputStream = clientSocket.getOutputStream()) {
            while (true) {
                //1.读取请求并分析
                Scanner scanner = new Scanner(inputStream);
                if(!scanner.hasNext()) {
                    //读完了，连接断开
                    System.out.printf("[%s:%d] 客户端下线",clientSocket.getInetAddress().toString(),
                            clientSocket.getPort());
                    break;
                }
                String request = scanner.next();
                //2.根据请求计算响应
                String response = process(request);
                //3.把响应写回客户端
                PrintWriter printWriter = new PrintWriter(outputStream);
                printWriter.println(response);
                //刷新缓冲区确保数据是通过网卡发送出去了
                printWriter.flush();
                System.out.printf("[%s:%d] req: %s; resp: %s\n",clientSocket.getInetAddress().toString(),
                        clientSocket.getPort(),request,response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            clientSocket.close();
        }
    }

    private String process(String request) {
        return request;
    }

    public static void main(String[] args) throws IOException {
        TcpEchoServer tcpEchoServer = new TcpEchoServer(9090);
        tcpEchoServer.start();
    }
}
