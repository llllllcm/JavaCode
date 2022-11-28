/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-15
 * Time: 10:19
 */
 class MobileShop {
    //用内部类InnerPurchaseMoney声明对象purchaseMoney1
    InnerPurchaseMoney purchaseMoney1;
    //用内部类InnerPurchaseMoney声明对象purchaseMoney2
    InnerPurchaseMoney purchaseMoney2;

    private int mobileAmount;//手机数量

    MobileShop() {
        //创建价值为20000的purchaseMoney1
        purchaseMoney1 = new InnerPurchaseMoney(20_000);
        //创建价值为10000的purchaseMoney2
        purchaseMoney2 = new InnerPurchaseMoney(10_000);
    }

    void setMobileAmount(int m) {
        mobileAmount = m;
    }

    int getMobileAmount() {
        return mobileAmount;
    }

    class InnerPurchaseMoney {
        int moneyValue;

        InnerPurchaseMoney(int m) {
            moneyValue = m;
        }

        void buyMobile() {
            if (moneyValue >= 20_000) {
                mobileAmount = mobileAmount - 6;
                System.out.println("用价值为" + moneyValue + "的内部购物券买了6部手机");
            } else if (moneyValue < 20_000 && moneyValue >= 10_000) {
                mobileAmount = mobileAmount - 3;
                System.out.println("用价值为" + moneyValue + "的内部购物券买了3部手机");
            }
        }

    }
}

public class MainClass {
    public static void main(String[] args) {
        MobileShop shop = new MobileShop();
        shop.setMobileAmount(30);
        System.out.println("手机专卖店目前有" + shop.getMobileAmount() + "部手机");
        shop.purchaseMoney1.buyMobile();
        shop.purchaseMoney2.buyMobile();
        System.out.println("手机专卖店目前有：" + shop.getMobileAmount());
    }
}
