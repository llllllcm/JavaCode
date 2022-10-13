/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-04
 * Time: 10:21
 */
class Teacher {
    int teacherType;
    public void speak() {
        if (teacherType == 1) {
            System.out.println("课程的内容是二次方程");
        }
        else if (teacherType == 2) {
            System.out.println("课程的内容是学唱五线谱");
        }
    }
}
class School {
    Teacher mathTeacher,musicTeacher;

    public void setMathTeacher(Teacher mathTeacher) {
        this.mathTeacher = mathTeacher;
    }

    public void setMusicTeacher(Teacher musicTeacher) {
        this.musicTeacher = musicTeacher;
    }
    public void startMathLesson() {
        mathTeacher.speak();
    }
    public void startMusicLesson() {
        musicTeacher.speak();
    }

}
public class demo2 {
    public static void main(String[] args) {
        Fight f = new Fight();
        Teacher zhang = new Teacher();
        Teacher  wang = new Teacher();
        zhang.teacherType = 1;
        wang.teacherType = 2;
        School expSchool = new School();
        expSchool.setMathTeacher(zhang);
        expSchool.setMusicTeacher(wang);
        expSchool.startMathLesson();
        expSchool.startMusicLesson();

    }
}
