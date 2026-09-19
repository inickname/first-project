package hw_5_oop_principles_in_java.task_3_restaurant_management;

public class Main {
    public static void main(String[] args) {
        Dish hotDish = new HotDish(55);
        Dish drink = new Drink(200);

        Menu menu = new Menu();

        menu.addDish(hotDish);
        menu.printMenu();

        menu.addDish(drink);
        menu.printMenu();
    }
}
