package book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-23
 * Time: 10:18
 */
public class Book {
    private String name;//书名
    private String author;//作者
    private int price;//价格
    private String type;//类型
    private boolean isBorrowed;//是否被借出

    //这里创建构造方法的时候没有给isBorrowed是因为，当我们new一本书的时候，虽然没有给其赋值，但是默认是false（没有借出）。
    public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }
    //得到一本书，放入一本书。

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ((isBorrowed == true ) ? "已经借出":"未借出")+
                '}';
    }
}
