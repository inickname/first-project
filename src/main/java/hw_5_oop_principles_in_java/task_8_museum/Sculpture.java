package hw_5_oop_principles_in_java.task_8_museum;

public class Sculpture extends Exhibit {

    @Override
    String describe() {
        return "Скульптурный объект";
    }

    @Override
    void preserve() {
        System.out.println("Реставрация");
    }
}
