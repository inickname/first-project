package hw_5_oop_principles_in_java.task_3_restaurant_management;

public class Drink extends Dish {
    private int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    @Override
    public String getDescription() {
        return "Объём напитка: " + this.volume + " мл";
    }
}
