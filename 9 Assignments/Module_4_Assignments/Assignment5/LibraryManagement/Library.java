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

    public void viewIssuedBooks() {
        for (Book b : bookList) {
            if (!b.isAvailable) {
                System.out.print(b.bookName + ", " + b.bookId);
                System.out.println();
            }
        }
    }

    public void removeBook(String bookName, int bookId) {
        int bookIndex = findBook(bookName, bookId);
        if (bookIndex >= 0) {
            String bName = bookList.get(bookIndex).bookName;
            bookList.remove(bookIndex);
            System.out.println(bName + " Book Removed");
        } else {
            System.out.println("Book not found");
        }
    }

    public void rentBook(String bookName, int bookId) {
        int index = findBook(bookName, bookId);
        if (index >= 0) {
            bookList.get(index).isAvailable = false;
            System.out.println(bookName + " Issued Successfully");
        } else {
            System.out.println("Book not found!!!");
        }
    }

    public int findBook(String bookName, int bookId) {
        int bookIndex = -1;
        for (int i = 0; i < bookList.size(); i++) {
            if (bookName.equals(bookList.get(i).bookName) && (bookId == bookList.get(i).bookId)) {
                bookIndex = i;
                break;
            }
        }
        return bookIndex;
    }
}
