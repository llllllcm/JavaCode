/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-15
 * Time: 10:01
 */
class Goods {
    boolean isDanger;
    String name;

    int a =2;

    public Goods(String name) {
        this.name = name;
    }
    public void setIsDanger(boolean boo) {
        isDanger = boo;
    }
    public boolean isDanger() {
        return isDanger;
    }

    public String getName() {
        return name;
    }
}
class Machine {
    public void checkBag(Goods goods) throws DangerException {
        if (goods.isDanger()) {
            DangerException dangerException = new DangerException();
            throw dangerException;
        }
    }
}

public class Check {
    public static void main(String[] args) {
        Machine machine = new Machine();
        Goods apple = new Goods("苹果");
        apple.setIsDanger(false);
        Goods explosive = new Goods("炸药");
        explosive.setIsDanger(true);
        try {
            machine.checkBag(explosive);
            System.out.println(explosive.getName()+"检查通过");
        } catch (DangerException e) {
            e.toShow();
            System.out.println(explosive.getName()+"已被禁止");
        }
        try {
            machine.checkBag(apple);
            System.out.println(apple.getName()+"检查通过");
        } catch (DangerException e) {
            e.toShow();
            System.out.println(apple.getName()+"被禁止");
        }
    }
}
