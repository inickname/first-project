package hw_4_conditional_statements_and_loops_in_java.solvers;

import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void main(String[] args) {
        // 1. Запрос положительного числа
        // guessNumber();

        // 2. Проверка пароля
        // checkPassword();

        // 3. Вывод чисел от 1 до 10 с использованием do-while
        // printNumbersFrom1To10();

        // 4. Завершение программы по команде "exit"
        // checkCommand();

        // 5. Подсчёт количества цифр в числе
        System.out.println(countDigitsInNumber());
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
    public static void printNumbersFrom1To10() {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    // 4. Завершение программы по команде "exit"
    public static void checkCommand() {
        Scanner scanner = new Scanner(System.in);
        String correctCommand = "exit";
        String input;

        do {
            System.out.print("Введите команду: ");
            input = scanner.next();
        } while (!input.equals(correctCommand));
    }

    // 5. Подсчёт количества цифр в числе
    public static int countDigitsInNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int count = 0;

        do {
            number /= 10;
            count++;
        } while (number != 0);

        return count;
    }
}
