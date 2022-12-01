import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-29
 * Time: 9:58
 */


public class CopyArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 500, 600, 700, 800};
        int[] b, c, d;
        System.out.println(Arrays.toString(a));
        b = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(b));
        //Arrays调用copyOf方法复制数组a的前4个元素到数组c中
        c = Arrays.copyOf(a, 4);
        //Arrays调用toString方法返回数组c的元素值的表示格式
        System.out.println(Arrays.toString(c));
        //Arrays调用copyOfRange方法复制数组a的后4个元素到数组d中
        d = Arrays.copyOfRange(a, 4, a.length);
        System.out.println(Arrays.toString(d));
        //将-100赋值给数组c的最后一个元素
        c[c.length - 1] = -100;
        d[d.length - 1] = -200;
        System.out.println(Arrays.toString(a));
    }
}
