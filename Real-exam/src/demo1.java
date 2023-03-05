/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-27
 * Time: 15:24
 */
public class demo1 {
    public static void main1(String[] args) {
        int count = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j < 9; j++) {
                for (int k = 1; k < 9; k++) {
                    for (int f = 1; f < 9; f++) {
                        for (int e = 1; e < 9; e++) {
                            if ((i*10+j) * (k*100+f*10+e) == (i*100+f*10+j)*(k*10+e)){
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {

    }

}
