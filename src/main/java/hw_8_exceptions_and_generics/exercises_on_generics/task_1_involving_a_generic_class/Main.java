package hw_8_exceptions_and_generics.exercises_on_generics.task_1_involving_a_generic_class;

public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setItem("Item1");
        System.out.println(box.getItem());
    }
}
