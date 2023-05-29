package newcar;

public class Tire {
    private int size = 17;

    public Tire(int size) {
        this.size = size;
    }

    public void init() {
        System.out.println("size ->" + size);
    }
}
