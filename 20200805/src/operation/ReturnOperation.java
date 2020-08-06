package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-08-06 10:32
 **/
public class ReturnOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("归还图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入归还图书的名字：");
        String name = scanner.nextLine();
        for (int i = 0; i <bookList.getUseSize() ; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                book.setBorrowed(false);
                System.out.println("归还成功！");
                return;
            }
        }
        System.out.println("没有你要归还的图书!");
    }
}
