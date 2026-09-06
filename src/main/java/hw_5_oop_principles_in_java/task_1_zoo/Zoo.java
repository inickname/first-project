package hw_5_oop_principles_in_java.task_1_zoo;

public class Zoo {
    public void setAnimal() {
        System.out.println("Животное добавлено в зоопарк");
    }

    public void showAnimalBehavior(Animal animal) {
        animal.move();
        animal.makeSound();
    }
}
