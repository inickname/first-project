package hw_5_oop_principles_in_java.task_5_farm;

public class Farm {
    private FarmAnimal animal;

    void setAnimal(FarmAnimal animal) {
        this.animal = animal;
    }

    void serviceAnimal() {
        this.animal.feed();
        this.animal.care();
        this.animal.produce();
    }
}
