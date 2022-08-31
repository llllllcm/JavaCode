package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-23
 * Time: 20:39
 */

abstract class Shape{
    public abstract void draw();
}
class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个花");
    }
}
public class Test {
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape = new Flower();
        shape.draw();
        drawMap(new Flower());
    }
}
