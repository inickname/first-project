package hw_4_conditional_statements_and_loops_in_java.solvers;

import java.util.Scanner;

public class BreakContinueTaskSolver {
    public static void main(String[] args) {
        // 1. Сумма чисел до первого отрицательного (использовать break)
        // sumOfNumbers();

        // 2. Пропуск чисел, делящихся на 3 (использовать continue)
        // skipNumbersDivisibleBy3();

        // 3. Вывод только положительных чисел (использовать continue)
        // printOnlyPositiveNumbers();

        // 4. Ввод строк до команды "stop" (использовать break)
        stringInput();
    }

    // 1. Сумма чисел до первого отрицательного (использовать break)
    public static void sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        while (true) {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
            if (number < 0) break;

            sum += number;
        }

        System.out.println(sum);
    }

    // 2. Пропуск чисел, делящихся на 3 (использовать continue)
    public static void skipNumbersDivisibleBy3() {

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) continue;
            System.out.println(i);
        }
    }

    // 3. Вывод только положительных чисел (использовать continue)
    public static void printOnlyPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
            if (number == 0) break;
            if (number < 0) continue;

            System.out.println(number);
        }
    }

    // 4. Ввод строк до команды "stop" (использовать break)
    public static void stringInput() {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Введите строку: ");
            input = scanner.next();

            if (input.equals("stop")) break;
            System.out.println(input);
        }
    }
}
