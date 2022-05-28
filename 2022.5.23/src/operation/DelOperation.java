package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-23
 * Time: 12:04
 */
public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的图书名字: ");
        String name = scanner.nextLine();
        int i = 0;
        int currentSize = bookList.getUsedSize();
        for (i = 0; i < currentSize; i++) {
            Book book1 = bookList.getBooks(i);
            Book book2 = bookList.getBooks(i + 1);
            if (book1.getName().equals(name)) {
                if (i == currentSize - 1) {
                    bookList.setBooksNull(i);
                    System.out.println("删除成功");
                } else {
                    while (i < currentSize){
                    bookList.setBooks(i, book2);
                    i++;

                }
                }
                System.out.println("删除成功");
                break;
            }


        }
        if (i == currentSize)
            System.out.println("没有这本书");
    }
}
