package hw_5_oop_principles_in_java.task_5_farm;

public class Chicken extends FarmAnimal {

    @Override
    void feed() {
        System.out.println("Ест зерно");
    }

    @Override
    void care() {
        System.out.println("Нуждается в кормушке");
    }

    @Override
    void produce() {
        System.out.println("Несёт яйца");
    }
}
