package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-08-06 10:30
 **/
public class DelOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("删除图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入删除图书的名字：");
        String name = scanner.nextLine();
        int i = 0;
        for (; i <bookList.getUseSize() ; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                break;
            }
        }
        if(i == bookList.getUseSize()) {
            System.out.println("没有你要删除的那本书");
            return;
        }
        for (int pos = i; pos < bookList.getUseSize() -1 ; pos++) {
            Book book = bookList.getBook(pos+1);
            bookList.setBooks(pos,book);
        }
        bookList.setUseSize(bookList.getUseSize()-1);
        System.out.println("删除成功!");
    }
}
