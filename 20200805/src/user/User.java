package user;

import book.BookList;
import operation.IOperation;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-08-06 14:45
 **/
public abstract class User {
     protected String name;
     protected IOperation[] operations;
     public User(String name)
     {
          this.name = name;
     }
     public abstract int menu();
     public void doOperation(BookList bookList,int choice){
          this.operations[choice].work(bookList);
     }
}
