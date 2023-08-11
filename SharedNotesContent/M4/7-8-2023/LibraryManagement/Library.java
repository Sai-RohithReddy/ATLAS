package LibraryManagement;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(String bookName, int bookId) {
        Book newBook = new Book(bookName, bookId);
        bookList.add(newBook);
    }

    public void viewBook() {
        for (Book b : bookList) {
            System.out.print(b.bookName + ", " + b.bookId);
            System.out.println();
        }
    }

    public void removeBook(String bookName, int bookId) {
        int flag = -1;
        for (int i = 0; i < bookList.size(); i++) {
            if (bookName.equals(bookList.get(i).bookName) && (bookId == bookList.get(i).bookId)) {
                flag = i;
                break;
            }
        }
        if (flag >= 0) {
            String bName = bookList.get(flag).bookName;
            bookList.remove(flag);
            System.out.println(bName + " Book Removed");
        } else {
            System.out.println("Book not found");
        }
    }
}
