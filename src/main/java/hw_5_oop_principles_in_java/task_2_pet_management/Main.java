package hw_5_oop_principles_in_java.task_2_pet_management;

import practice_5.task_2.Manager;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog();
        Pet cat = new Cat();

        PetManager petManager = new PetManager();

        petManager.setPet(dog);
        petManager.handlePet(dog);

        petManager.setPet(cat);
        petManager.handlePet(cat);
    }
}
