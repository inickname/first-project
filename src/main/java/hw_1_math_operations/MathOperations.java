package hw_1_math_operations;

public class MathOperations {

    public static void main(String[] args) {
        //1. Напишите класс hw_1_math_operations.MathOperations
        int add1 = add(2, 4);
        System.out.println("Результат сложения: " + add1);

        int subtract1 = subtract(4, 2);
        System.out.println("Результат вычитания: " + subtract1);

        int multiply1 = multiply(2, 4);
        System.out.println("Результат умножения: " + multiply1);

        double divide1 = divide(4, 2);
        System.out.println("Результат деления: " + divide1);

        // 2. Реализуйте метод для нахождения максимума двух чисел
        int findMax1 = findMax(2, 4);
        System.out.println("Результат нахождения максимума двух чисел: " + findMax1);

        // 3. Метод для нахождения разницы между двумя числами
        int difference1 = difference(2, 4);
        System.out.println("Результат нахождения разницы между двумя числами: " + difference1);

        // 4. Методы для площади и периметра квадрата
        int squareArea1 = squareArea(2);
        System.out.println("Результат нахождения площади квадрата: " + squareArea1);

        int squarePerimeter1 = squarePerimeter(2);
        System.out.println("Результат нахождения периметра квадрата: " + squarePerimeter1);

        // 5. Метод для перевода секунд в минуты
        double convertSecondsToMinutes1 = convertSecondsToMinutes(120);
        System.out.println("Результат перевода секунд в минуты: " + convertSecondsToMinutes1);

        // 6. Метод для вычисления средней скорости
        double averageSpeed1 = averageSpeed(110.1, 1.1);
        System.out.println("Результат вычисления средней скорости: " + averageSpeed1);

        double averageSpeed2 = averageSpeed(1000.0, 7.0);
        System.out.println("Результат вычисления средней скорости: " + averageSpeed2);

        // 7. Метод для нахождения гипотенузы
        double findHypotenuse1 = findHypotenuse(2, 2);
        System.out.println("Результат нахождения гипотенузы: " + findHypotenuse1);

        double findHypotenuse2 = findHypotenuse(4, 12);
        System.out.println("Результат нахождения гипотенузы: " + findHypotenuse2);

        // 8. Метод для длины окружности
        double circleCircumference1 = circleCircumference(8.3);
        System.out.println("Результат нахождения длины окружности: " + circleCircumference1);

        double circleCircumference2 = circleCircumference(5.0);
        System.out.println("Результат нахождения длины окружности: " + circleCircumference2);

        // 9. Метод для вычисления процентов
        double calculatePercentage1 = calculatePercentage(200.0, 25.0);
        System.out.println("Результат вычисления процентов: " + calculatePercentage1 + "%");

        // 10. Методы перевода температуры
        double celsiusToFahrenheit1 = celsiusToFahrenheit(26.0);
        System.out.println("Результат перевода температуры в Фаренгейты: " + celsiusToFahrenheit1);

        double fahrenheitToCelsius1 = fahrenheitToCelsius(78.8);
        System.out.println("Результат перевода температуры в Цельсий: " + fahrenheitToCelsius1);
    }

    //1. Напишите класс hw_1_math_operations.MathOperations
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

    // 2. Реализуйте метод для нахождения максимума двух чисел
    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    // 3. Метод для нахождения разницы между двумя числами
    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    // 4. Методы для площади и периметра квадрата
    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return side * 4;
    }

    // 5. Метод для перевода секунд в минуты
    public static double convertSecondsToMinutes(int seconds) {
        return seconds / 60.0;
    }

    // 6. Метод для вычисления средней скорости
    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    // 7. Метод для нахождения гипотенузы
    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    // 8. Метод для длины окружности
    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // 9. Метод для вычисления процентов
    public static double calculatePercentage(double total, double part) {
        return (part / total) * 100;
    }

    // 10. Методы перевода температуры
    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
