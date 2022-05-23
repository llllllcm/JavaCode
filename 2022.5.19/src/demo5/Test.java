package demo5;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-21
 * Time: 14:57
 */
class Student implements Comparable<Student>{
    public String name;
    public int age;
    public double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}
class AgeComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age- o2.age;
    }
}
class ScoreComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.score - o2.score);
    }
}
class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name) ;
    }
}
public class Test {
    public static void main(String[] args) {
        Student[] student = new Student[3];
        student[0] = new Student("ld",100,78);
        student[1] = new Student("lcm",22,99);
        student[2] = new Student("bzb",102,28);
        ScoreComparator scoreComparator = new ScoreComparator();
        System.out.println("排序前"+ Arrays.toString(student));
        Arrays.sort(student,scoreComparator);
        Arrays.sort(student,new NameComparator());

        System.out.println("排序后"+Arrays.toString(student));
    }
    public static void main3(String[] args) {
        Student student1 = new Student("ld",100,78);
        Student student2 = new Student("lcm",22,99);
        AgeComparator ageComparator = new AgeComparator();
        int ret = ageComparator.compare(student1,student2);
        System.out.println(ret);
        ScoreComparator scoreComparator = new ScoreComparator();
        int ret2 = scoreComparator.compare(student1,student2);
        System.out.println(ret2);
    }
    public static void main2(String[] args) {
        Student[] student = new Student[3];
        student[0] = new Student("ld",100,78);
        student[1] = new Student("lcm",22,99);
        student[2] = new Student("bzb",102,28);
        System.out.println("排序前"+ Arrays.toString(student));
        Arrays.sort(student);
        System.out.println("排序后"+Arrays.toString(student));

    }
    public static void main1(String[] args) {
        Student student1 = new Student("ld",100,78);
        Student student2 = new Student("lcm",22,99);
        //如何比较这两个对象的大小。
//        if(student1.compareTo(student2) > 0){
//            System.out.println("student1 > student2");
//
//        }

    }

}
