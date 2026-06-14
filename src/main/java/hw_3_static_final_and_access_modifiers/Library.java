package hw_3_static_final_and_access_modifiers;

public class Library {
    private String bookTitle = "Три товарища";
    protected String author = "Эрих Мария Ремарк";
    int year = 1936;
    public String category = "Роман";

    String getBookTitle() {
        return this.bookTitle;
    }

    void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    String getAuthor() {
        return this.author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    int getYear() {
        return this.year;
    }

    void setYear(int year) {
        this.year = year;
    }

    String getCategory() {
        return this.category;
    }

    void setCategory(String category) {
        this.category = category;
    }
}
