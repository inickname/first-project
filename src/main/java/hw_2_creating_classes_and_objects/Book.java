package hw_2_creating_classes_and_objects;

public class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void printInfo() {
        System.out.println("Название книги: " + this.title + ", автор: " + this.author);
    }
}
