package hw_8_exceptions_and_generics.exercises_on_exceptions.task_3_creating_and_using_a_custom_checked_exception;

public class UserAgeIsInvalidException extends Exception {
    public UserAgeIsInvalidException(String message) {
        super(message);
    }
}
