package demo2;

import demo1.TestDemo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-18
 * Time: 0:12
 */
public class Test extends TestDemo {
    public void func2(){
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.a);
        test.func2();

    }

}
