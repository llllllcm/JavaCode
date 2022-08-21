/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-17
 * Time: 20:12
 */
public class Student {
    public String name;
    public int score;
    public int age;
    public static  int classes = 3;

    static {
        classes = 5;
        System.out.println("这时静态代码块");
    }
    {
        this.name = "张三";
        System.out.println("这是实例代码块");
    }

    public Student(String name, int score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
        System.out.println("带有3个参数的构造方法");

    }


    public void func1(){
        System.out.println("普通方法"+name);
        classes = 2;

    }
    public static void func2(){
        System.out.println("这是一个静态方法");
    }
}
