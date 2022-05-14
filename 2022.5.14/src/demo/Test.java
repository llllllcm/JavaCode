package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-14
 * Time: 15:22

 */
class Student {
    //普通成员变量
    public String name;
    public double score;
    public int age;

    //静态成员变量[类变量]：不属于对象


    static {
        //一般用来初始化静态成员
        classes = "102";
        System.out.println();
        System.out.println("静态代码块");
    }
    public static   String classes = "105Java" ;//班级


    public Student(String name, double score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
        System.out.println("带有三个参数的构造方法执行了");
    }
    public static void staticFun(){
        //name = "22";
        Student student = new Student("lcm",2222,12);
        student.name = "june";
        System.out.println(student.name);
        System.out.println("这是一个静态方法");
    }
    public void goClass(){
        System.out.println("上课"+name);
        {
            System.out.println("本地代码块");
        }
    }
    {
        //类的内部，方法的外部
        this.name = "jane";
        System.out.println("实例代码块");
    }


}
public class Test {
    public static void main(String[] args) {
//        Student.classes = "1922";
        Student student = new Student("lcm",99,19);
        /*System.out.println(student.classes);
        student.goClass();*/
        //student.staticFun();
        //System.out.println(Student.classes);
        System.out.println("================");
        Student student2 = new Student("lcm",99,19);

    }



}


