import java.util.StringTokenizer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-29
 * Time: 11:01
 */
class ComputePrice{

    public double compute(String s, String fenge) {
        StringTokenizer fenxiOne = new StringTokenizer(s,fenge);
        double sum = 0;
        double digitItem = 0;
        while(fenxiOne.hasMoreTokens()) {
            String str = fenxiOne.nextToken();
            digitItem = Double.parseDouble(str);
            sum = sum + digitItem;
        }
        return sum;
    }
}
public class E {
    public static void main(String[] args) {
        String s1 = "苹果: 56.7元, 香蕉: 12元, 芒果:19.8元";
        String s2 = "酱油: 6.7元, 香蕉: 0.8元, 芒果:9.8元";
        ComputePrice jisuan = new ComputePrice();
        String regex = "[^0123456789.]+";
        String s1_number = s1.replaceAll(regex,"*");
        double priceSum = jisuan.compute(s1_number,"*");
        System.out.printf("\"%s\"价格总和：\n%f元\n",s1,priceSum);
        String s2_number = s2.replaceAll(regex,"#");
        priceSum = jisuan.compute(s2_number,"#");
        System.out.printf("\"%s\"价格总和：\n%f元\n",s2,priceSum);

    }
}
