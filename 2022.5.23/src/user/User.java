package user;

import book.BookList;
import operation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:不管你是管理员还是用户，都有相同的地方
 * User: 86136
 * Date: 2022-05-23
 * Time: 12:15
 */
public abstract class User {
    protected String name;//用户名
    public IOperation[] iOperation;
    public abstract int menu();

    public User(String name) {
        this.name = name;

    }
    public void doOperation(int choice, BookList bookList){
        this.iOperation[choice].work(bookList);


    }
}
