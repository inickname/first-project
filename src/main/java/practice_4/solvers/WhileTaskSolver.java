package practice_4.solvers;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
        // Проверка метода по выводу всех чисел от 1 до 10
        // printAllNumberBefore10();

        // Проверка программы по считыванию команд, пока не введут exit
        // commandReader();

        // Проверка метода по подсчету сумм цифр в числе
        System.out.println(sumOfDigits(123));
        System.out.println(sumOfDigits(1101));
    }

    public static void printAllNumberBefore10() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void commandReader() {
        Scanner scanner = new Scanner(System.in);
        String command = "";

        while (!command.equals("exit")) {
            System.out.print("Введите команду: ");
            command = scanner.nextLine();
        }

        System.out.println("Программа завершена.");
    }

    public static int sumOfDigits(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
