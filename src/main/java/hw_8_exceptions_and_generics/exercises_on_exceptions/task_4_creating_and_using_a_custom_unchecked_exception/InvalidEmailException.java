package hw_8_exceptions_and_generics.exercises_on_exceptions.task_4_creating_and_using_a_custom_unchecked_exception;

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String message) {
        super(message);
    }
}
