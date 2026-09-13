package hw_5_oop_principles_in_java.task_3_restaurant_management;

public class Menu {
    private Dish dish;

    public void addDish(Dish dish) {
        this.dish = dish;
    }

    public void printMenu(Dish dish) {
        System.out.println(dish.getDescription());
    }
}
