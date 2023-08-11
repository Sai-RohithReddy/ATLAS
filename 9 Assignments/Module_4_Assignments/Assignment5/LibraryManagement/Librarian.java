package LibraryManagement;

public class Librarian {
    public static void main(String[] args) {
        Library librarian = new Library();
        librarian.addBook("Harry Potter", 123);
        librarian.addBook("Rich Dad Poor Dad", 111);
        librarian.addBook("The Secret", 555);
        librarian.addBook("The India Story", 666);
        librarian.addBook("A Place Called Home", 222);
        librarian.addBook("Queen of Fire", 333);
        librarian.addBook("The Maverick Effect", 444);
        librarian.viewBook();

        System.out.println("____________________\n");

        librarian.removeBook("The Secret", 555);

        System.out.println("____________________\n");

        librarian.viewBook();

        System.out.println("____________________\n");

        librarian.rentBook("The Maverick Effect", 444);
        librarian.rentBook("The India Story", 666);

        System.out.println("____________________\n");

        System.out.println("Issued Books\n");
        librarian.viewIssuedBooks();
    }
}
