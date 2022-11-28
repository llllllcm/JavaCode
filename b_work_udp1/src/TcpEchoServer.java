import jdk.internal.util.xml.impl.Input;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-19
 * Time: 13:06
 */
public class TcpEchoServer {
    private ServerSocket listenSocket = null;

    public TcpEchoServer(int port) throws IOException {
        listenSocket = new ServerSocket(port);
    }
    public void start() throws IOException {
        System.out.println("服务器启动");
        while(true) {
            //1.先调用accept方法来接受客户端的连接
            Socket clientSocket = listenSocket.accept();
            //2.再调用这个连接
            Thread t = new Thread(()->{
                try{
                    procession(clientSocket);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            t.start();
        }
    }

    private void procession(Socket clientSocket) throws IOException {
        System.out.printf("[%s:%d]客户端上线: \n",clientSocket.getInetAddress().toString(),
                clientSocket.getPort());
        //处理客户信息
        //这里的clientSocket 既可以调用去读信息可以调用去写信息
        try(InputStream inputStream = clientSocket.getInputStream();
            OutputStream outputStream = clientSocket.getOutputStream()) {
            while(true) {
                //1.读取请求分析
                Scanner scanner = new Scanner(inputStream);
                if(!scanner.hasNext()) {
                    //读完了连接断开
                    System.out.printf("[%s:%d] 客户端下线",clientSocket.getInetAddress().toString(),
                            clientSocket.getPort());
                    break;
                }
                //2.根据请求进行响应
                String request = scanner.next();
                String response = process(request);
                //3.把响应写回客户端
                PrintWriter printWriter = new PrintWriter(outputStream);
                printWriter.println(response);
                //刷新缓冲区确保数据是通过网卡发送出去的
                printWriter.flush();
                System.out.printf("[%s:%d] req:%s; resp: %s \n",clientSocket.getInetAddress().toString(),
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
