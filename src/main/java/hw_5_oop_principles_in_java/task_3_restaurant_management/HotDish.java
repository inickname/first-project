package hw_5_oop_principles_in_java.task_3_restaurant_management;

public class HotDish extends Dish {
    private int temperature;

    public HotDish(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return this.temperature;
    }

    @Override
    public String getDescription() {
        return "Температура горячего блюда: " + this.temperature + "°C";
    }
}
