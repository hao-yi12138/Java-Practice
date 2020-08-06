package operation;

import book.BookList;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-08-06 10:32
 **/
public class ExitOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("退出系统");
         System.exit(1);
    }
}
