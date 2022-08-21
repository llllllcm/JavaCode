/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-17
 * Time: 20:11
 */
public class Demo2 {
    public void func3(){

    }
    public static void func4(){


    }

    public static void main2(String[] args) {
        System.out.println(Student.classes);
    }

    public static void main(String[] args) {
        Student student = new Student("张三",99,18);
        System.out.println("========================");
        Student student2 = new Student("李四",80,19);


    }
    public static void main1(String[] args) {
//        Student student1 = new Student("张三",99,18);
//        Student student2 = new Student("李四",80,19);
        //调用该类的非静态方法(提供对象)
        {
            Demo2 demo2 = new Demo2();
            demo2.func3();
        }
        //调用该类的静态方法
        func4();
        Demo2.func4();
        //调用不同类的静态方法
        Student.func2();
    }


}
