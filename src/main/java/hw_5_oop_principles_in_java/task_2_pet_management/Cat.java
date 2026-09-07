package hw_5_oop_principles_in_java.task_2_pet_management;

public class Cat extends Pet implements Feedable, Interactable {
    @Override
    public void feed() {
        System.out.println("Ест влажный корм");
    }

    @Override
    public void interact() {
        System.out.println("Играет");
    }
}
