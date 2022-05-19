/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-19
 * Time: 0:15
 */
class Shape{
    public void draw(){
        System.out.println("画图形");
    }

}
class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("圆形");
    }
}
class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("菱形");
    }
}
public class Test {
    public static void draw(Shape shape){
        shape.draw();
    }

    public static void main(String[] args) {
        draw(new Cycle());
        draw(new Rect());
    }

}
