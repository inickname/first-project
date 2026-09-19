package hw_5_oop_principles_in_java.task_6_botanical_garden;

import practice_5.task_1.Car;

public class BotanicalGarden {
    private Plant plant;

    void setPlant(Plant plant) {
        this.plant = plant;
    }

    void maintainPlant() {

        if (this.plant instanceof Careable) {
            Careable careablePlant = (Careable) this.plant;
            careablePlant.care();
        }
    }
}
