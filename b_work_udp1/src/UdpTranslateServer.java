import java.io.IOException;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-19
 * Time: 12:44
 */
public class UdpTranslateServer extends UdpEchoServer{
    //翻译的本质是key -> value
    private Map<String,String> dict = new HashMap<>();

    public UdpTranslateServer(int port) throws SocketException {
        super(port);
        dict.put("cat","猫咪");
        dict.put("志彬","修勾");
    }

    @Override
    public String process(String request) {
        return dict.getOrDefault(request,"词在单词表中未找到");
    }

    public static void main(String[] args) throws IOException {
        UdpTranslateServer udpTranslateServer = new UdpTranslateServer(9090);
        udpTranslateServer.start();
    }
}
