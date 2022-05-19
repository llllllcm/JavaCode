package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-19
 * Time: 16:06
 */
//抽象类
abstract class Shape{
    //抽象方法
    public abstract void draw();

}
class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
class  triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}


public class Test {
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        //Shape shape = new Shape();
        drawMap(new Rect());
        drawMap(new triangle());

    }

}
