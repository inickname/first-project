package hw_8_exceptions_and_generics.exercises_on_generics.task_3_involving_a_generic_with_two_data_types;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>();

        pair.setFirst("First");
        pair.setSecond(2);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
