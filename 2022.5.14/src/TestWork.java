

/**
* Created with IntelliJ IDEA.
* Description:
* User: 86136
* Date: 2022-05-14
* Time: 21:48
*/
class Test111{
    static int cnt = 6;
    static{
        cnt += 9;
    }
    public static void main(String[] args){
        System.out.println("cnt ="+cnt);
    }
    static{
        cnt /=3;
    };
}
class aa{
    public static void main(String[] args) {
        TestWork s = new TestWork();
        s.a= 4;
        System.out.println(s.a);
    }

}
public class TestWork {
//    public static void main1(String[] args) {
//        String s;
//        System.out.println(s);
//    }
        /*static boolean Paddy;
        public static void main2(String args[]){
            System.out.println(Paddy);
        }*/
    int a = 3;
    private static int x = 100;// 2
    public static void main3(String args[]) {// 3
        TestWork hsl = new TestWork();// 4
        hsl.x++;// 5
        TestWork hs2 = new TestWork();// 6
        hs2.x++;// 7
        hsl = new TestWork();// 8
        hsl.x++;// 9
        TestWork.x--;// 10
        System.out.println(" x=" + x);// 11
    }

    }

