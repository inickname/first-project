package hw_4_conditional_statements_and_loops_in_java.solvers;

import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void main(String[] args) {
        // 1. Запрос положительного числа
        guessNumber();
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
}
