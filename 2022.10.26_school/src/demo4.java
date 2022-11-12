/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-08
 * Time: 10:03
 */

class MobileShop {
    InnerPurchaseMoney innerPurchaseMoney1;
    InnerPurchaseMoney innerPurchaseMoney2;

    public MobileShop() {
        innerPurchaseMoney1 = new InnerPurchaseMoney(20_000);
        innerPurchaseMoney2 = new InnerPurchaseMoney(10_000);
    }

    private int mobileAmount;

    public void setMobileAmount(int mobileAmount) {
        this.mobileAmount = mobileAmount;
    }

    public int getMobileAMount() {
        return mobileAmount;
    }

    class InnerPurchaseMoney {
        int moneyValue;

        public InnerPurchaseMoney(int moneyValue) {
            this.moneyValue = moneyValue;
        }
        void buyMobile() {
            if(moneyValue >= 20_000) {
                mobileAmount = mobileAmount - 6;
                System.out.println("用价值"+moneyValue+"的内部购物卷买了6台手机");
            } else if (moneyValue < 20_000 && moneyValue >= 10_000) {
                mobileAmount = mobileAmount - 3;
                System.out.println("用价值"+moneyValue+"的内部购物卷买了3台手机");
            }
        }
    }
}
public class demo4 {
    public static void main(String[] args) {
        MobileShop mobileShop = new MobileShop();
        mobileShop.setMobileAmount(30);
        System.out.println("手机专卖店目前有"+mobileShop.getMobileAMount());
        mobileShop.innerPurchaseMoney1.buyMobile();
        mobileShop.innerPurchaseMoney2.buyMobile();
        System.out.println("手机专卖店目前有"+mobileShop.getMobileAMount()+"部手机");
    }

}
