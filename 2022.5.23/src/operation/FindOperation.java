package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-23
 * Time: 12:03
 */
public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        int currentSize = bookList.getUsedSize();


        System.out.println("查找图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要查找的图书名字: ");
        String name = scanner.nextLine();
        for (int i = 0; i < currentSize; i++) {
            Book book = new

        }
    }
}
