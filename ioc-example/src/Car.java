public class Car {
    private Framework framework;
    //既然车是依赖于车架的，所以我们需要在构造方法中new它。
    public Car(int size) {
        framework = new Framework(size);
    }
    public void init() {
        System.out.println("do car");
        framework.init();
    }
    public static void main(String[] args) {
        Car car = new Car(14);
        car.init();
    }
}
