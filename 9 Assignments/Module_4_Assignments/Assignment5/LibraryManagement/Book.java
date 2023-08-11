package LibraryManagement;

public class Book {
    public String bookName;
    public int bookId;
    public boolean isAvailable;

    public Book(String bookName, int bookId) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.isAvailable = true;
    }
}
