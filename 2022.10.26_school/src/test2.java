import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-01
 * Time: 10:39
 */
//定义一个形状类Shape，提供计算周长getPerimeter()和面积getArea()的函数
//定义一个子类正方形类Square继承自Shape类，拥有边长属性，提供构造函数，能够计算周长getPerimeter()和面积getArea()
//定义一个子类长方形类Rectangle继承自Square类，拥有长、宽属性，提供构造函数，能够计算周长getPerimeter()和面积getArea()
//定义一个子类圆形类Circle继承自Shape，拥有半径属性，提供构造函数，能够计算周长getPerimeter()和面积getArea()
//
//在main函数中，分别构造三个Shape类的变量，分别指向一个Square、Rectangle、Circle对象，并输出他们的周长、面积.
class Shape {
    int Perimeter;
    int Area;

    public double getPerimeter() {
        return Perimeter;
    }

    public double getArea() {
        return Area;
    }
}
class Square extends Shape {
    int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return length*4;
    }

    @Override
    public double getArea() {
        return length*length;
    }
}
class Rectangle extends Square {
    int length;
    int wide ;

    public Rectangle(int length, int length1, int wide) {
        super(length);
        this.length = length1;
        this.wide = wide;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+wide);
    }

    @Override
    public double getArea() {
        return length*wide;
    }
}
class Circle extends Shape {

    int r;

    public Circle(int r) {
        r = r;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*r;
    }

    @Override
    public double getArea() {
        return 3.14*Math.pow(r,2);
    }
}
public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        int b = s.charAt(0);
        int c = s.charAt(1);
        int d = scanner.nextInt();
        Shape square = new Square(a);
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());
        Shape rectangle = new Rectangle(a,b,c);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        Shape circle = new Circle(d);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
    }
}
