import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-09
 * Time: 20:56
 */
public class test {
    public static void main(String[] args) {
        IOException
        int i,s=0;
        int a[] ={10,20,30,40,50,60,70,80,90};
        for(i=0;i<a.length;i++){
            if(a[i]%3==0)
                s+=a[i];
            System.out.println("s="+s);
        }

    }
}
