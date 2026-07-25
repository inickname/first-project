package hw_4_conditional_statements_and_loops_in_java.solvers;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
        // 1. Вычисление факториала с помощью while
        System.out.println(calculateFactorial());
    }

    // 1. Вычисление факториала с помощью while
    public static int calculateFactorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int result = 1;
        int i = 1;

        while (i <= n) {
            result *= i;
            i++;
        }

        return result;
    }
}
