package hw_4_conditional_statements_and_loops_in_java.solvers;

import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void main(String[] args) {
        // 1. Запрос положительного числа
        // guessNumber();

        // 2. Проверка пароля
        // checkPassword();

        // 3. Вывод чисел от 1 до 10 с использованием do-while

    }

    // 1. Запрос положительного числа
    public static void guessNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
        } while (number <= 0);
    }

    // 2. Проверка пароля
    public static void checkPassword() {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "1234";
        String input;

        do {
            System.out.print("Введите пароль: ");
            input = scanner.next();
        } while (!input.equals(correctPassword));
    }

    // 3. Вывод чисел от 1 до 10 с использованием do-while

}
