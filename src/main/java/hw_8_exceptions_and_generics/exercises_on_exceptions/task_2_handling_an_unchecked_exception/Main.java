package hw_8_exceptions_and_generics.exercises_on_exceptions.task_2_handling_an_unchecked_exception;

public class Main {
    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!");
        }
    }
}
