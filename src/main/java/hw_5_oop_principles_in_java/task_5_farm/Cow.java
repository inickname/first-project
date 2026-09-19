package hw_5_oop_principles_in_java.task_5_farm;

public class Cow extends FarmAnimal {

    @Override
    void feed() {
        System.out.println("Ест траву");
    }

    @Override
    void care() {
        System.out.println("Выпас");
    }

    @Override
    void produce() {
        System.out.println("Даёт молоко");
    }
}
