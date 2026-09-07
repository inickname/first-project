package hw_5_oop_principles_in_java.task_2_pet_management;

public class Dog extends Pet implements Feedable, Interactable {
    @Override
    public void feed() {
        System.out.println("Ест сухой корм");
    }

    @Override
    public void interact() {
        System.out.println("Гуляет");
    }
}
