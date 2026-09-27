package hw_5_oop_principles_in_java.task_8_museum;

public class Manuscript extends Exhibit {

    @Override
    String describe() {
        return "Древний текст";
    }

    @Override
    void preserve() {
        System.out.println("Контролируемая влажность");
    }
}
