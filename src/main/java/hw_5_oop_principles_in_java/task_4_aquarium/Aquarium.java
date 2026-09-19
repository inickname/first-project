package hw_5_oop_principles_in_java.task_4_aquarium;

public class Aquarium {
    private SeaCreature creature;

    public void setCreature(SeaCreature creature) {
        this.creature = creature;
    }

    public void showMovement() {
        this.creature.move();
    }
}
