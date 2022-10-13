/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-10-04
 * Time: 10:08
 */
class Tank {
    //速度
    private double speed = 0;
    //炮弹数量
    private int bulletAmount = 0;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getBulletAmount() {
        return bulletAmount;
    }

    public void setBulletAmount(int bulletAmount) {
        this.bulletAmount = bulletAmount;
    }
    public void fire() {
        if (bulletAmount >= 1) {
            bulletAmount--;
            System.out.println("打出一发炮弹");
        }
        else {
            System.out.println("没有炮弹了，无法开火");
        }
    }
}
public class Fight {
    public static void main(String[] args) {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank();
        tank1.setBulletAmount(10);
        tank2.setBulletAmount(10);
        System.out.println("tank1的弹药数量为： "+tank1.getBulletAmount());
        System.out.println("tank2的弹药数量为： "+tank2.getBulletAmount());
        tank1.setSpeed(80);
        tank2.setSpeed(90);
        System.out.println("tank1当前的速度为："+tank1.getSpeed());
        System.out.println("tank2当前的速度为："+tank2.getSpeed());
        tank1.setSpeed(15);
        tank1.setSpeed(90);
        System.out.println("tank1当前的速度为："+tank1.getSpeed());
        System.out.println("tank2当前的速度为："+tank2.getSpeed());
        System.out.println("tank1开火");
        tank1.fire();
        System.out.println("tank2开火");
        tank2.fire();
        tank2.fire();
        System.out.println("tank1的炮弹数量："+tank1.getBulletAmount());
        System.out.println("tank2的炮弹数量："+tank2.getBulletAmount());


    }
}
