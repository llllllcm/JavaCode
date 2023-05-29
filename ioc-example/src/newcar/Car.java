package newcar;

public class Car {
    private Framework framework;
    public Car(Framework framework) {
//        framework = new Framework();
        this.framework = framework;
    }
    public void init() {
        System.out.println("do car...");
        framework.init();
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        String[] b = (String[]) a;
    }

}
