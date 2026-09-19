package hw_5_oop_principles_in_java.task_6_botanical_garden;

public class Main {
    public static void main(String[] args) {
        Plant orchid = new Orchid();
        Plant cactus = new Cactus();

        BotanicalGarden botanicalGarden = new BotanicalGarden();

        botanicalGarden.setPlant(orchid);
        botanicalGarden.maintainPlant();

        botanicalGarden.setPlant(cactus);
        botanicalGarden.maintainPlant();
    }
}
