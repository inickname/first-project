package hw_8_exceptions_and_generics.exercises_on_exceptions.task_4_creating_and_using_a_custom_unchecked_exception;

public class Main {
    public static void main(String[] args) {
        System.out.println(EmailValidator.isValidEmail("user1@nomail.com"));
        System.out.println(EmailValidator.isValidEmail("user2@nomail.c"));
    }
}
