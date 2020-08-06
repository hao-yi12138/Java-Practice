package operation;

import book.Book;
import book.BookList;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-08-06 10:31
 **/
public class DisplayOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("显示图书");
        for (int i = 0; i <bookList.getUseSize() ; i++) {
           Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}
