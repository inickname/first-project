package hw_8_exceptions_and_generics.exercises_on_exceptions.task_3_creating_and_using_a_custom_checked_exception;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        try {
            user.verifyUserAge(151);
        } catch (UserAgeIsInvalidException e) {
            System.out.println("Поймали исключение! " + e.getMessage());
        }
    }
}
