package hw_5_oop_principles_in_java.task_4_aquarium;

public class Main {
    public static void main(String[] args) {
        SeaCreature shark = new Shark();
        SeaCreature starfish = new Starfish();

        Aquarium aquarium = new Aquarium();

        aquarium.setCreature(shark);
        aquarium.showMovement();

        aquarium.setCreature(starfish);
        aquarium.showMovement();
    }
}
