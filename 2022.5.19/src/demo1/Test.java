package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-19
 * Time: 16:04
 */

class Shape {
    public void draw(){
//        System.out.println("画图形");
    }
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
        drawMap(new Rect());
        drawMap(new triangle());
    }

}

