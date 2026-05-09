public class HelloWorld {
    static int a = 1;

    public static void main(String[] args) {
        int sum1 = sum(1001, 2000);
        System.out.println("Результат сложения: " + sum1);

        int mult1 = multiply(3, 2);
        System.out.println("Результат умножения: " + mult1);

        int subs1 = substruct(10, 3);
        System.out.println("Результат вычитания: " + subs1);

        double div1 = divide(3, 2);
        System.out.println("Результат деления: " + div1);
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int multiply(int p, int k) {
        int mult = p * k;
        return mult;
    }

    public static int substruct(int g, int l) {
        return g - l;
    }

    public static double divide(int s, int h) {
        return (double) s / h;
    }
}
