import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-09
 * Time: 19:21
 */
class WashMachine{
    //1、字段(属性)【成员变量】类的内部，方法的外部
    //目前这里的public先加上，继承时候再说

    public String brand; // 品牌
    public String type; // 型号
    public double weight; // 重量
    public double lenght; // 长
    public double weidth; // 宽
    public double height; // 高
    public String color; // 颜色

    //2、行为。方法【成员方法】

    public void WashClothes(){ // 洗衣服
        System.out.println("洗衣功能");
    }
    public void dryClothes(){ // 脱水
        System.out.println("脱水功能");
    }
    public void SetTime() { // 定时
        System.out.println("定时功能");
    }

}
class Dog{
    public String name;//名字
    public String color;//颜色
    //狗的属性
    public void barks(){
        System.out.println(name+ ": 汪汪汪~~~");
    }
    //狗的行为
    public void wag(){
        System.out.println(name+":摇尾巴~~~");
    }
}

public class Test {
    /*//二维数组初始化三种形式：
    public static void main1(String[] args) {
        int [][] array1 = new int[][]{{1,2,3},{2,3,4}};
        int [][] array2 = new int[3][4];
        int [][] array3 = {{1,2,3,},{2,3,4,}};
        System.out.println(Arrays.deepToString(array2));
    }*/
    //定义一个类(不一定都由成员变量和方法构成)

        public static void main(String[] args) {
            Dog dog = new Dog(); //通过new实例化对象
            dog.name = "阿黄";
            dog.color = "黑黄";
            dog.barks();
            dog.wag();
            Dog dogs = new Dog();
            dogs.name = "阿黄";
            dogs.color = "黑黄";
            dogs.barks();
            dogs.wag();
        }




}
