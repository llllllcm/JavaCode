/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-09-19
 * Time: 19:23
 */
public class work2 {
    public static void main(String[] args) {
        int startPosition = 0,endPosition = 0;
        char cStart = 'a',cEnd = 'w';
        startPosition = (int)cStart;
        endPosition = cEnd;
        System.out.println("希腊字母\'a\'在unicode表中的顺序位置："+startPosition);
        System.out.println("希腊字母表");
        for (int i = startPosition; i <= endPosition ; i++) {
            char c = '\0';
            c = (char)i;
            System.out.print(" "+c);
            if ((i-startPosition) % 10 == 0 ) {
                System.out.println("");
            }
        }
    }
}
