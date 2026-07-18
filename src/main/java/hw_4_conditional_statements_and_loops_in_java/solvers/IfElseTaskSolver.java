package hw_4_conditional_statements_and_loops_in_java.solvers;

import java.util.Scanner;

public class IfElseTaskSolver {
    public static void main(String[] args) {
        // 1. Определение знака числа
        // System.out.println(determiningSignOfNumber());

        // 2. Поиск наибольшего из двух чисел
        // System.out.println(checkMax());

        // 3. Вывод оценки по шкале 1–5
        // System.out.println(printMark());

        // 4. Проверка на чётность
        System.out.println(checkParity());

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

    // 3. Вывод оценки по шкале 1–5
    public static String printMark() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите оценку: ");
        int mark = scanner.nextInt();
        String result = "Программа принимает число от 1 до 5";

        if (mark == 5) {
            result = "Отлично";
        } else if (mark == 4) {
            result = "Хорошо";
        } else if (mark == 3) {
            result = "Удовлетворительно";
        } else if (mark == 2 || mark == 1) {
            result = "Неудовлетворительно";
        }
        return result;
    }

    // 4. Проверка на чётность
    public static String checkParity() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        String result = "Нечетное";

        if (number % 2 == 0) {
            result = "Четное";
        }

        return result;
    }
}
