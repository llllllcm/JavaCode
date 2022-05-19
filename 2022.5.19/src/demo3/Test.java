package demo3;



/**
* Created with IntelliJ IDEA.
* Description:
* User: 86136
* Date: 2022-05-19
* Time: 17:01
*/
interface IShape{
      void draw();
}
class Rect implements IShape{

    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }

}
class Triangle implements IShape{
    @Override
    public void draw() {
        System.out.println("画一个圆形");
    }
}
public class Test {
    public static void drawMap(IShape shape){
        shape.draw();
    }

    public static void main(String[] args) {
        IShape iShape = new Rect();
        drawMap(new Rect());
        drawMap(new Triangle());
    }


}
