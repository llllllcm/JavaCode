package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-23
 * Time: 12:08
 */
public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");
        int currentSize = bookList.getUsedSize();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要归还的图书名字: ");
        String name = scanner.nextLine();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name)){
                System.out.println("归还成功");
                book.setBorrowed(false);
            }

        }
    }
}
