package book;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2020-08-06 10:15
 **/
public class BookList {
    private Book []books = new Book[100];
    private int useSize = 0;
    public BookList(){
        books[0] = new Book("三国演义", "罗贯中", 100, "小说");
        books[1] = new Book("水浒传", "施耐庵", 100, "小说");
        books[2] = new Book("西游记", "吴承恩", 100, "小说");
        this.useSize = 3;
    }
    public void setBooks(int pos,Book book){
        this.books[pos] = book;
    }
    public Book getBook(int pos){
       return this.books[pos];
    }
    public int getUseSize() {
        return useSize;
    }

    public void setUseSize(int useSize) {
        this.useSize = useSize;
    }
}
