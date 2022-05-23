package book;

/**
 * Created with IntelliJ IDEA.
 * Description:书架
 * User: 86136
 * Date: 2022-05-23
 * Time: 10:18
 */
public class BookList {
    //最多放10本书
    private Book[] books = new Book[10];
    private int usedSize;//实时记录，当前books这个数组当中有多少本书
    //当我们去实例话一个BookList时候呢，我们就先创建三本书
    public BookList(){
        books[0] = new Book("三国演义","罗贯中",19,"小说");
        books[1] = new Book("西游记","吴承恩",42,"小说");
        books[2] = new Book("红楼梦","曹雪芹",22,"小说");
        usedSize = 3;//实时记录
    }

    /**
     *
     * @param pos 此时pos位置设定一定是合法的（目前没学太深入）
     * @return 一本书
     */
    //给一个下标，然后就会返回这个下标所对应的一本书
    public Book getBooks(int pos) {
        return books[pos-1];
    }

    /**
     *
     * @param pos 一定是合法的
     * @param book 我们要放的书
     */
    public void setBooks(int pos,Book book){
        books[pos - 1] = book;
    }

    /**
     * 实时获取当前书的个数
     * @return
     */
    public int getUsedSize(){
        return usedSize;
    }


}
