package operation;

import book.Book;
import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-23
 * Time: 12:05
 */
public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书");
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
                System.out.println(bookList.getBooks(i));
        }
    }
}
