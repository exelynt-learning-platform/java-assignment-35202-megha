// Importing Book class from the libraryutils package.
import libraryutils.Book;

public class LibrarySystem {

    public static void main(String[] args) {

        // Creating multiple Book objects
        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("Wings of Fire", "A. P. J. Abdul Kalam");

        // Calling displayBookInfo() for each book
        System.out.println("Book 1 Details:");
        book1.displayBookInfo();

        System.out.println();

        System.out.println("Book 2 Details:");
        book2.displayBookInfo();
    }
}