/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-12
 * Time: 16:38
 */
abstract class Car{

    public void run(){
        System.out.println("car run");
    }
    public void show(){
        System.out.println(getClass().getName());
    }
}
class Width {
    public static final int SINGLE = 1;
}

class Shape {

    public void draw(int Width) {
        System.out.println("Shape.draw()"+Width);
    }
}

class Circle extends Shape {
    public void draw(Width n) {
        System.out.println("Circle.draw()");
    }
}
public class Test {
    public static void test(Shape s) {
        s.draw(Width.SINGLE);
    }
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 10 - i) {
                break;
            }

            if (i % 3 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
//    public static void main(String[] args) {
//        Test t = new Test();
//        t.show(new Car(){
//            public void run(){
//                System.out.println("test run");
//            }
//        });
//    }
//    public void show(Car c){
//        c.run();
//        c.show();
//    }
}

