package hw_4_conditional_statements_and_loops_in_java.solvers;

public class ForTaskSolver {
    public static void main(String[] args) {
        // 1. Вывод чисел от 1 до 100, делящихся на 3
        printNumbersDivisibleBy3();

        // 2. Сумма чисел от 1 до n

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

}
