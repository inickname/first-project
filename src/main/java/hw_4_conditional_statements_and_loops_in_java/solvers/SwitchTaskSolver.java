package hw_4_conditional_statements_and_loops_in_java.solvers;

import java.util.Scanner;

public class SwitchTaskSolver {
    public static void main(String[] args) {
        // 1. Вывод дня недели по номеру
        // System.out.println(dayOfWeek());

        // 2. Стоимость билета по дню недели
        // System.out.println(ticketPrice());

        // 3. Перевод числовых оценок в буквенные (A–F)
        // System.out.println(checkMark());

        // 4. Обработка текстовых команд
        // System.out.println(processingTextCommands());

        // 5. Простой калькулятор с использованием switch
    }

    // 1. Вывод дня недели по номеру
    public static String dayOfWeek() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int day = scanner.nextInt();
        String dayOfWeek = "";

        switch (day) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Unknown";
        }

        return dayOfWeek;
    }

    // 2. Стоимость билета по дню недели
    public static String ticketPrice() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день недели: ");
        int dayOfWeek = scanner.nextInt();
        String ticketPrice = "";

        switch (dayOfWeek) {
            case 1, 2, 3, 4, 5:
                ticketPrice = "300 рублей";
                break;
            case 6, 7:
                ticketPrice = "450 рублей";
                break;
            default:
                ticketPrice = "Unknown";
        }

        return ticketPrice;
    }

    // 3. Перевод числовых оценок в буквенные (A–F)
    public static String checkMark() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int score = scanner.nextInt();
        String mark = "";

        switch (score / 10) {
            case 9, 10:
                mark = "A";
                break;
            case 8:
                mark = "B";
                break;
            case 7:
                mark = "C";
                break;
            case 6:
                mark = "D";
                break;
            case 5, 4, 3, 2, 1, 0:
                mark = "F";
                break;
            default:
                mark = "Unknown";
        }

        return mark;
    }

    // 4. Обработка текстовых команд
    public static String processingTextCommands() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение: ");
        String command = scanner.nextLine();
        String result = "";

        switch (command) {
            case "start":
                result = "Система запущена";
                break;
            case "stop":
                result = "Система остановлена";
                break;
            case "restart":
                result = "Система перезапущена";
                break;
            case "status":
                result = "Состояние системы";
                break;
            default:
                result = "Ошибка ввода";
        }

        return result;
    }

    // 5. Простой калькулятор с использованием switch

}
