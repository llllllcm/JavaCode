/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-12
 * Time: 0:11
 */

interface c {

}
interface o {

}
interface i extends c,o {

}
class D extends B implements c,i{

}
class Person {

}
class Teacher extends Person {

}
class Student extends Person{

}
public class Demo5 {

//p,t and s are all non-null.
public static void main(String[] args) {
    Person p;
    Teacher t;
    Student s;
//    if(t instanceof Person){
//        p =(Person) t;
//    }
}

}
