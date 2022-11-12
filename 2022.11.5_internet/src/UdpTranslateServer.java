import java.io.IOException;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-12
 * Time: 20:37
 */
public class UdpTranslateServer extends UdpEchoServer{

    //翻译的本质其实就是 key -> value
    private Map<String,String> dict = new HashMap<>();
    public UdpTranslateServer (int port) throws SocketException {
        super(port);
        dict.put("cat","猫咪");
        dict.put("dog","修勾");
        //这里可以填入很多内容，像市面上见到的许多翻译软件，
        // 都是这样实现的（有一个很大的hash表，包含了几乎所有单词）
    }

    @Override
    public String process(String request) {
        return dict.getOrDefault(request,"词在单词表中未找到");
    }

    public static void main(String[] args) throws IOException {
        UdpTranslateServer server = new UdpTranslateServer(9090);
        server.start();
    }
}
