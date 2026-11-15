package hw_8_exceptions_and_generics.exercises_on_generics.task_2_involving_a_generic_method;

public class Main {
    public static <T> void printElements(T[] elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        printElements(new Integer[]{1, 2, 3});
        printElements(new String[]{"Яблоко", "Апельсин"});
    }
}
