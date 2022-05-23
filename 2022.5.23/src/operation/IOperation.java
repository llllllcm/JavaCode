package operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-05-23
 * Time: 11:57
 */

/**
 * 通过这个接口来访问我的BookList
 * （当然也可以不写接口，直接把我们的操作都放到BookList中）
 */
public interface IOperation {
    void work(BookList bookList);//因为我们要操作这个BookList里面的数组

}
