import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-22
 * Time: 9:08
 */
class Person{
    public String id;

    public Person(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + id + '\'' +
                '}';
    }

    /**
     * 一般 自定义类型都要重写equals
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj){

          //return this.id.equals(obj.id);这里报错的原因是因为，Object里面没有id这个成员
        //所以我们用向下转型的方法
        if(obj == null){
            return false;
        }
        /**
         * Person person1 = new Person("111");
         * Person person2 = person1;
         * System.out.println(person1.equals(person2));
         *
         */
        if(obj == this){
            return true;
        }
        //如果两个不是相同类就没有比较的必要，因为”兄弟类“是不能互相强制类型转换的。
        if(!(obj instanceof Person)){
            return false;
        }
         Person tmp = (Person)obj;
         return this.id.equals(tmp.id);

    }
}
class Student{
    public String id;

    public Student(String id) {
        this.id = id;
    }
}
public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("111");
        Student student = new Student("111");
        System.out.println(person1.equals(student));

    }
    public static void main4(String[] args) {
        Person person1 = new Person("111");
        Person person2 = person1;
        System.out.println(person1.equals(person2));
    }
    public static void main1(String[] args) {
        int[] arr = new int[]{1,2,3};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);
    }
    public static void func(Object o){
        String str = o.toString();
        System.out.println(str);
        System.out.println(o);
    }

    public static void main2(String[] args) {
        func(new Student("111"));
        func(new Person("111"));
    }

    public static void main3(String[] args) {
        Person person1 = new Person("111");
        Person person2 = new Person("111");
        System.out.println(person1.equals(person2));
    }
}
