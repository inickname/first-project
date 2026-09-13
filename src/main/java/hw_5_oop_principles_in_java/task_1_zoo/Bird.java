package hw_5_oop_principles_in_java.task_1_zoo;

public class Bird extends Animal {

    @Override
    void makeSound() {
        System.out.println("Птица чирикает");
    }

    @Override
    void move() {
        System.out.println("Птица летает");
    }
}
