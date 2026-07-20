package hw_4_conditional_statements_and_loops_in_java.solvers;

import java.util.Scanner;

public class ForTaskSolver {
    public static void main(String[] args) {
        // 1. Вывод чисел от 1 до 100, делящихся на 3
        // printNumbersDivisibleBy3();

        // 2. Сумма чисел от 1 до n
        // System.out.println(sumOfAllNumber());

        // 3. Таблица умножения для числа
        // multiplyTable();

        // 4. Проверка на простое число
        // System.out.println(checkNumberIsPrime());

        // 5. Вывод чисел от 1 до 10
        printNumbersFrom1To10();
    }

    // 1. Вывод чисел от 1 до 100, делящихся на 3
    public static void printNumbersDivisibleBy3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    // 2. Сумма чисел от 1 до n
    public static int sumOfAllNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    // 3. Таблица умножения для числа
    public static void multiplyTable() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    // 4. Проверка на простое число
    public static String checkNumberIsPrime() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime ? "Число простое" : "Число не является простым";
    }

    // 5. Вывод чисел от 1 до 10
    public static void printNumbersFrom1To10() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
