package practice_8.library.exceptions;

// проверяемое -> Exception (наследуется или от самого Exception, или от наследников)
public class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}
