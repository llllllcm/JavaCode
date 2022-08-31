package demo2;

import demo1.Test;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-21
 * Time: 15:02
 */
public class TestDemo extends Test {
    public void func(){
        System.out.println(super.a);

    }


    public static void main(String[] args) {
        Test test = new Test();

    }
}
