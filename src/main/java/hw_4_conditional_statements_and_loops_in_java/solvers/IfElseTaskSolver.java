package hw_4_conditional_statements_and_loops_in_java.solvers;

import java.util.Scanner;

public class IfElseTaskSolver {
    public static void main(String[] args) {
        // 1. Определение знака числа
        // System.out.println(determiningSignOfNumber());

        // 2. Поиск наибольшего из двух чисел
        System.out.println(checkMax());
    }

    // 1. Определение знака числа
    public static String determiningSignOfNumber() {
        Scanner scanner = new Scanner(System.in);
        String result = "Число равно нулю";

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            result = "Число положительное";
        } else if (number < 0) {
            result = "Число отрицательное";
        }

        return result;
    }

    // 2. Поиск наибольшего из двух чисел
    public static int checkMax() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        return Math.max(num1, num2);
    }
}
