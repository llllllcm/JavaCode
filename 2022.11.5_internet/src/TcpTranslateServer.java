import java.io.IOException;
import java.net.ServerSocket;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-19
 * Time: 14:14
 */
public class TcpTranslateServer extends TcpEchoServer{
    private Map<String,String> dict = new HashMap<>();

    public TcpTranslateServer(int port) throws IOException {
        super(port);
        dict.put("cat","猫咪");
        dict.put("志彬","修勾");
    }
    @Override
    public String process(String request) {
        return dict.getOrDefault(request,"查无此词！");
    }

    public static void main(String[] args) throws IOException {
        TcpTranslateServer server = new TcpTranslateServer(9090);
        server.start();
    }
}
