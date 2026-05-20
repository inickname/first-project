public class MathOperations {

    public static void main(String[] args) {
        //1. Напишите класс MathOperations
        int add1 = add(2, 4);
        System.out.println("Результат сложения: " + add1);

        int subtract1 = subtract(4, 2);
        System.out.println("Результат вычитания: " + subtract1);

        int multiply1 = multiply(2, 4);
        System.out.println("Результат умножения: " + multiply1);

        double divide1 = divide(4, 2);
        System.out.println("Результат деления: " + divide1);
    }

    //1. Напишите класс MathOperations
    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return x / (double) y;
    }
}
