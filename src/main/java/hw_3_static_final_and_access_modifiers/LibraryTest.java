package hw_3_static_final_and_access_modifiers;

public class LibraryTest {
    void checkLibrary() {
        Library library = new Library();

        // String bookTitle = library.bookTitle;
        String author = library.author;
        int year = library.year;
        String category = library.category;

        String bookTitle1 = library.getBookTitle();
    }
}
