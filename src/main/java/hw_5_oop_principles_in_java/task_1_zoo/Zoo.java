package hw_5_oop_principles_in_java.task_1_zoo;

public class Zoo {
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void showAnimalBehavior() {
        this.animal.move();
        this.animal.makeSound();
    }
}
