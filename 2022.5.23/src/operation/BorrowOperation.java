package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-23
 * Time: 12:07
 */
public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        int currentSize = bookList.getUsedSize();
        System.out.println("借阅图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要借阅的图书名字: ");
        String name = scanner.nextLine();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name)){
                System.out.println("借阅成功");
                book.setBorrowed(true);
            }

        }
        System.out.println("没有这本书");
    }
}
