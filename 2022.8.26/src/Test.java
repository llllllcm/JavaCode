import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-08-26
 * Time: 15:54
 */
class Student /*implements Comparable<Student>*/{
    public int age;
    public String name;
    public int score;


    public Student(int age, String name, int score) {
        this.age = age;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.age-o.age;
//    }
}
class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}
class ScoreComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.score-o2.score;
    }
}
public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(1,"a",11);
        students[1] = new Student(2,"b",22);
        students[2] = new Student(3,"c",33);
        AgeComparator ageComparator = new AgeComparator();
        Arrays.sort(students,ageComparator);
        System.out.println(Arrays.toString(students));
    }

}
