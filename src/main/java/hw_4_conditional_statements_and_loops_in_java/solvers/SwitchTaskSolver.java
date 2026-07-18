package hw_4_conditional_statements_and_loops_in_java.solvers;

import java.util.Scanner;

public class SwitchTaskSolver {
    public static void main(String[] args) {
        // 1. Вывод дня недели по номеру
        // System.out.println(dayOfWeek());

        // 2. Стоимость билета по дню недели

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

}
