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
public class BorrowOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("借阅图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name = scanner.nextLine();
        for (int i = 0; i <bookList.getUseSize() ; i++) {
           Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
            book.setBorrowed(true);
                System.out.println("借阅成功");
                    return;
      }
      }
        System.out.println("没有你要借阅的那本书");
    }
}