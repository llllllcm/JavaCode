import java.util.Scanner;

public class TestDemo {


    public static boolean isPrime2(int n) {

        int i = 2;
        for (; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static int func(int a,int b) {
        return a+b;
        //System.out.println(a+b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(func(a,b) * 10);
    }

    public static void swap(int a,int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

    public static void main22(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);
        System.out.println("=====================");
        swap(a,b);
        System.out.println(a);
        System.out.println(b);
    }

    public static void main20(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100 ; i++) {
            if(i % 10 == 9) {
                count++;
            }else if(i / 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main19(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int n = scan.nextInt();

            for(int i = 0;i < n;i++) {
                for(int j = 0;j < n;j++) {
                    if(i == j) {
                        System.out.print("*");
                    }else if( i+j+1 == n) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main16(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        while (count != 0) {
            System.out.println("请输入你的密码：");
            String password = scanner.nextLine();
            if(password.equals("123456")) {
                System.out.println("登录成功！");
                break;
            }else {
                count--;
                System.out.println("你还有 "+count+"次机会！");
            }
        }
    }

    public static void main15(String[] args) {
        int n = 7;
        for (int i = 31; i >= 1 ; i-=2) {
            //偶数位
            System.out.print(((n >> i) & 1)+" ");
        }

        System.out.println();
        for (int i = 30; i >= 0 ; i-=2) {
            //奇数位
            System.out.print(((n >> i) & 1)+" ");
        }

    }
    public static void main14(String[] args) {
        int n = -1;
        int count = 0;
        while (n != 0) {
            n = n &(n-1);
            count++;
        }
        System.out.println(count);
    }

    public static void main13(String[] args) {
        int n = -1;
        int count = 0;
        while (n != 0) {
            if((n & 1) != 0) {
                count++;
            }
            n = n >>> 1;//  >>>
        }
        System.out.println(count);
    }

    public static void main12(String[] args) {
        int n = 7;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if(  ((n >> i) & 1) != 0   ) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main11(String[] args) {
        double d = 9.9;
        int a = (int)d;
        int b = (int)9.9;
    }

    public static void main10(String[] args) {

        for (int i = 1; i < 999999; i++) {
            int count = 0;//位数
            int tmp = i;
            while (tmp != 0) {
                count++;//3
                tmp = tmp / 10;//0
            }
            //tmp == 0;  count = 3; i = 123
            tmp = i;//123
            int sum = 0;
            while (tmp != 0) {
                sum += Math.pow(tmp % 10,count);
                //sum = (int)(sum + Math.pow(tmp % 10,count));
                tmp /= 10;
            }
            //此时的sum 藜麦存储的 是tmp的每一位的count次方和
            if(sum == i) {
                System.out.println(i);
            }
        }
    }

    //TODO:求最小公倍数
    public static void main9(String[] args) {
        //辗转相除法
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a%b;
        while (c != 0) {
            a = b;
            b = c;
            c = a%b;
        }
        System.out.println(b+" 是最大公约数！");
    }

    public static void main7(String[] args) {
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int n) {
        int i = 2;
        for (; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                //System.out.println(n+": 不是素数！");
                break;
            }
        }
        if(i > Math.sqrt(n)) {
            //System.out.println(n+": 是素数！");
            return true;
        }
        return false;
    }

    public static void main5(String[] args) {
        for (int i = 1; i < 101; i++) {
            boolean ret = isPrime(i);
            if(ret) {
                System.out.println(i+" 是素数！");
            }
        }
    }

    public static void main6(String[] args) {

        for (int j = 1; j < 101; j++) {
            //int n = 19;
            int i = 2;
            for (; i <= Math.sqrt(j); i++) {
                if(j % i == 0) {
                    //System.out.println("不是素数！");
                    break;
                }
            }
            if(i > Math.sqrt(j)) {
                System.out.println(j+" 是素数！");
            }
        }

    }

    public static void main3(String[] args) {
        int n = 9;
        int i = 2;
        for (; i <= n/2; i++) {
            if(n % i == 0) {
                System.out.println("不是素数！");
                break;
            }
        }
        if(i > n/2) {
            System.out.println("是素数！");
        }
    }

    public static void main2(String[] args) {
        int n = 7;
        int i = 2;
        for (; i < n; i++) {
            if(n % i == 0) {
                System.out.println("不是素数！");
                break;
            }
        }
        //1、i==n  2、n%i==0
        if(i == n) {
            System.out.println("是素数！");
        }
    }

    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if(age < 18) {
            System.out.println("少年！");
        }else if(age >= 18 && age < 28) {
            System.out.println("青年！");
        }else if(age >= 29 && age < 55) {
            System.out.println("中年！");
        }else {
            System.out.println("老年！");
        }
    }
}