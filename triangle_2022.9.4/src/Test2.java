import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-04
 * Time: 15:15
 */
public class Test2 {
    public static void main(String[] args) {
        CardDemo cardDemo = new CardDemo();
        List<Card> ret = cardDemo.buyDeskCard();
        cardDemo.shuffle(ret);
        System.out.println(ret);
        System.out.println("发牌");
        List<List<Card>> ret2 = cardDemo.deal(ret);
        for (int i = 0; i < ret2.size(); i++) {
            System.out.println("第"+i+"个人的牌： "+ret2.get(i));
        }
    }
}
