import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-18
 * Time: 10:11
 */
abstract class Geometry {
    public abstract double getArea();
}
class Rect extends Geometry {
    double a;
    double b;

    public Rect(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a*b;
    }
}
class Circle extends Geometry {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return 3.14*Math.pow(r,2);
    }
}
class Student {
    public double area(Geometry...p) {
        double sum = 0;
        for (int i = 0; i < p.length; i++) {
            sum += p[i].getArea();
        }
        return sum;
    }
}
public class demo2 {
    public static void main(String[] args) {
        String str = "abD";
        System.out.println(str);
        str.toUpperCase();
        str.replace('a','b');
        System.out.println("===========================");
        System.out.println(str);
        int[] arr = new int[]{1,2,3};
        
        for (int x: arr) {
            System.out.println(x);
            break;
        }
        Student zhang = new Student();
        double area = zhang.area(new Rect(2,3),new Circle(5.2),new Circle(12));
        System.out.printf("两个圆和一个矩形图形的面积和：\n%10.3f",area);
    }
}
