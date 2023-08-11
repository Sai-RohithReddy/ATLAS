package LibraryManagement;

public class Librarian {
    public static void main(String[] args) {
        Library librarian = new Library();
        librarian.addBook("Harry Potter", 123);
        librarian.addBook("Rich Dad Poor Dad", 111);
        librarian.addBook("The Secret", 555);
        librarian.viewBook();

        System.out.println("____________________");

        librarian.removeBook("The Secret", 555);

        System.out.println("____________________");

        librarian.viewBook();
    }
}
