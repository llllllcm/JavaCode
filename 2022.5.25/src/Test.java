/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-25
 * Time: 15:05
 */
abstract class shape{
   public abstract void draw();
    public abstract void draw2();

}
 abstract class Rect extends shape{
     @Override
     public void draw2() {
         System.out.println();
     }

 }
 class c extends Rect{

     @Override
     public void draw() {

     }

 }
public class Test {
}
