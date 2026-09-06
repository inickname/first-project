package hw_5_oop_principles_in_java.task_1_zoo;

public class Elephant extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Слон трубит");
    }

    @Override
    public void move() {
        System.out.println("Слон ходит");
    }
}
