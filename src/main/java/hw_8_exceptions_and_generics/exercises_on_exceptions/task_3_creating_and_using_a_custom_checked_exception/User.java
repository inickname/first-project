package hw_8_exceptions_and_generics.exercises_on_exceptions.task_3_creating_and_using_a_custom_checked_exception;

import practice_8.library.exceptions.BookNotFoundException;

public class User {
    public void verifyUserAge(int userAge) throws UserAgeIsInvalidException {
        if (userAge < 0 || userAge > 150) {
            throw new UserAgeIsInvalidException("Возраст пользователя невалидный");
        }
        System.out.println("Возраст корректный!");
    }
}
