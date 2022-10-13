/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-04
 * Time: 10:39
 */
class village {
    public static int treeAmount;
    int peopleNumber;
    String name;

    public village(String name) {
        this.name = name;
    }
    public void treePlanting(int n) {
        treeAmount = treeAmount+n;
        System.out.println(this.name+"植树"+n+"颗");

    }
//    public void fellTree(int n) {
//        if ()
//
//    }
}
public class demo3 {
    public static void main(String[] args) {

    }
}
