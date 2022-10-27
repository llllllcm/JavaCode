
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-22
 * Time: 12:19
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        String s = in.nextLine();
//        //这里不能使用split。
//        int count = 0;
//        for(int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) == '"') {
//                do{
//                    i++;
//                }while(s.charAt(i) != '"' );
//            }
//            if(s.charAt(i) == ' ') {
//                count++;
//            }
//        }
//        System.out.println(count+1);
//        int flag = 1;
//        for(int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) == '"') {
//                flag ^= 1;
//            }
//            //引号内的空格不需要换行
//            if(s.charAt(i) == ' ' && flag == 0) {
//                System.out.print(s.charAt(i));
//            }
//            //碰到空格换行(引号外)
//            if(s.charAt(i) == ' ' && flag != 0) {
//                System.out.println();
//                continue;
//            }
//            System.out.print(s.charAt(i));
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        String s = " ";
//        s.split(" ");
//        int n = in.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++) {
//            arr[i] = in.nextInt();
//        }
//        //dp[i] i下标以内的最大和
//        //dp[i] = Max(arr[i],dp[i-1] + arr[i]);
//        int max = arr[0];
//        int sum = arr[0];
//        for(int i = 1; i < n; i++) {
//            sum = Math.max(arr[i]+sum,arr[i]);
//            if(sum > max) {
//                max = sum;
//            }
//        }
//        System.out.println(max);
//
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        System.out.println(Math.max(-2,-4));
//    }
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        int count = 0;
//        int i = 0;
//        //34  n = 2
//        //01
//        while(i < n) {
//            if( arr[i] < arr[i+1]) {
//                while(i < n-1 && arr[i] < arr[i+1]) {
//                    i++;
//                }
//                count++;
//                i++;
//            }else if(i < n-1 && arr[i] == arr[i+1]) {
//                i++;
//            }else {
//                //前面的数比后面的大
//                while(i < n -1 && arr[i] > arr[i+1]) {
//                    i++;
//                }
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}
//import java.util.Scanner;
//
//class Employee{
//    public int salary;
//    public int base;
//    public int extra;
//
//    public void setSalary(int base,int extra) {
//        this.base = base;
//        this.extra = extra;
//    }
//
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//
//    public int getSalary() {
//        return salary;
//    }
//}
//class Manager extends Employee {
//    int salary = 0;
//    @Override
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    @Override
//    public int getSalary() {
//        return salary;
//    }
//}
//class Salesman extends Employee {
//    int extra = 0;
//    int base = 0;
//
//    @Override
//    public void setSalary(int base, int extra) {
//        this.base = base;
//        this.extra = extra;
//        this.salary = base + extra;
//    }
//
//    @Override
//    public int getSalary() {
//        return this.salary;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Employee manager = new Manager();
//        manager.setSalary(in.nextInt());
//        System.out.println(manager.getSalary());
//        Employee salesman = new Salesman();
//        salesman.setSalary(in.nextInt(), in.nextInt());
//        System.out.println(salesman.getSalary());
//
//    }
//}
//class Father {
//    int a;
//    public Father(int a) {
//        this.a=a;
//    }
//    public void print() {
//        System.out.println(a);
//    }
//}
//
//class Child extends Father {
//    int a;
//     Child(int a) {
//         super(a);
//        // 将形参a的数值赋给父类成员变量a
//
//        this.a = super.a*10;
//        // 将父类成员变量a的值*10赋给本类的成员变量a
//    }
//    public void print() {
//        System.out.println(super.a);    // 输出父类成员变量a的值
//        System.out.println(this.a);      // 输出子类成员变量a的值
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Child child=new Child(10);
//        child.print();
//    }
//}
//class  Fish { int weight=1; }
//class  Lake{
//    Fish  fish;
//    void  setFish(Fish s) { fish=s; }
//    void  foodFish(int m){  fish.weight=fish.weight+m; }
//}
//public  class  Main {
//    public static void main(String args[]){
//        Fish  redFish=new Fish();
//        System.out.println(redFish.weight);//【代码1】
//        Lake lake=new Lake();
//        lake.setFish(redFish);
//        lake.foodFish(120);
//        System.out.println(redFish.weight);//【代码2】
//        System.out.println(lake.fish.weight);//【代码3】
//    }
//}
//class People {
//    int a = 1;
//    private int c = 2;
//    String name;
//    public People() {
//        System.out.print(1);
//    }
//    public People(String name) {
//        System.out.print(2);
//        this.name = name;
//    }
//}
//class Child extends People {
//    People father;
//    public Child(String name) {
//        System.out.print(3);
//        this.name = name;
//        father = new People(name + ":F");
//    }
//    public Child(){
//        System.out.println(super.a);
//        System.out.print(4);
//    }
//}
// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static boolean isLeapYear(int year) {
//        if((year % 4 == 0 && year % 100 != 0 ) || year % 100 == 0) {
//            return true;
//        }else {
//            return false;
//        }
//    }
//    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        int result = 0;
//        int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
//        String date = in.nextLine();
//        String[] arr = date.split(" ");
//        String s ="121";
//        boolean flag = isLeapYear(Integer.parseInt(arr[0]));
//        if(flag == true) {
//            month[1] = 29;
//        }
//        int m = Integer.parseInt(arr[1]);
//        for(int i = 0; i < m-1;i++) {
//            result += month[i];
//        }
//        int day = Integer.parseInt(arr[2]);
//        result = result + day;
//        System.out.print(result);
//
//    }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int[] arr = new int[11];
//        Arrays.sort(arr);
//        String a = " ";
//        a.split(" ");
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        //没有引号的情况
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == ' ') {
//                count++;
//            }
//        }
//        System.out.println(count+1);
//        String[] result = s.split(s, ' ');
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }
//    }
//        BinaryTree binaryTree = new BinaryTree();
//        BinaryTree.TreeNode root = binaryTree.createTree();
//        System.out.println("前序遍历");
//        binaryTree.preOrder(root);
//        System.out.println();
//        System.out.println("中序遍历");
//        binaryTree.inOrder(root);
//        System.out.println();
//        System.out.println("后序遍历");
//        binaryTree.postOrder(root);
//        System.out.println();
//        System.out.println(binaryTree.getKLevelNodeCount(root,3));
//        System.out.println(binaryTree.getHeight(root));
//    }
//}
// 孩子表示法
//class Node {
//    int val; // 数据域
//    Node left; // 左孩子的引用，常常代表左孩子为根的整棵左子树
//    Node right; // 右孩子的引用，常常代表右孩子为根的整棵右子树
//}
//public class Main {
//    class Node {
//        int value; // 树中存储的数据
//        Node firstChild; // 第一个孩子引用
//        Node nextBrother; // 下一个兄弟引用
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        int x = in.nextInt();
//        //用来存放符合条件的素数
//        int[] arr = new int[100];
//        int count = 0;
//        //找出2~x 之间的所有素数
//        for(int i = 2; i < x; i++) {
//            boolean flag = true;
//            for(int j = 2; j < i; j++) {
//                if(i % j == 0) {
//                    //说明不是素数
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag == true) {
//                arr[count] = i;
//                count++;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        //现在arr里面存放着所有素数，现在进行筛选
//        //暴力
//        // 2 3 7 11 13
//        int min = Integer.MAX_VALUE;
//
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = i; j < arr.length; j++) {
//                if(arr[i] + arr[j] == x) {
//                    min = Math.min(min,arr[j] - arr[i]);
//                }
//            }
//        }
//        if(min == Integer.MAX_VALUE) {
//            for(int i = 0; i < arr.length; i++) {
//                if(arr[i] + arr[i] == x) {
//                    System.out.println(arr[i]);
//                    System.out.println(arr[i]);
//                }
//            }
//        }
//        System.out.println("最小值："+min);
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = 0; j < arr.length; j++ ) {
//                if(arr[j] - arr[i] == min && arr[i] + arr[j] == x) {
//                    System.out.println(arr[i]);
//                    System.out.println(arr[j]);
//                }
//            }
//        }
//    }
//}
public class Main {
    public void Main() {

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();

            int count = 0;
            int[] arr = new int[300];
            // 5 = 0101
            // 5mod2 = 1   5/2 = 2
            // 2mod2 = 0   2/2=  1
            // 1mod2 = 1   1/2= 0
            while(n != 0) {
                int i = 0;
                arr[i++] = n % 2;
                n = n / 2 ;

            }
            for(int i = 0; i < arr.length; i++ ) {
                if(arr[i] == 1) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
