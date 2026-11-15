package hw_8_exceptions_and_generics.exercises_on_exceptions.task_4_creating_and_using_a_custom_unchecked_exception;

import java.util.regex.Pattern;

public class EmailValidator {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    public static boolean isValidEmail(String email) throws InvalidEmailException {
        boolean isValid = EMAIL_PATTERN.matcher(email).matches();

        if (!isValid) {
            throw new InvalidEmailException("Невалидный email");
        }
        return isValid;
    }
}