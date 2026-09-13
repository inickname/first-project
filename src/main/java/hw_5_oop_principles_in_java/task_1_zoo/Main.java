package hw_5_oop_principles_in_java.task_1_zoo;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal elephant = new Elephant();

        Zoo zoo = new Zoo();

        zoo.setAnimal(bird);
        zoo.showAnimalBehavior();

        zoo.setAnimal(elephant);
        zoo.showAnimalBehavior();
    }
}
