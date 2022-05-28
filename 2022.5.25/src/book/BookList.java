package book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-26
 * Time: 14:48
 */
public class BookList {
    Book[] books = new Book[10];
    private int usedSize;//实时记录这个书架书的个数
    public BookList() {
        books[0] = new Book("三国演义","小说","罗贯中",11);
        books[1] = new Book("西游记","小说","吴承恩",22);
        books[2] = new Book("红楼梦","小说","",33);
        usedSize = 3;

    }


}
