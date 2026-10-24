package practice_7.restaurant_manager;

import java.util.LinkedList;

public class RestaurantManager {
    private LinkedList<String> orders;

    public RestaurantManager() {
        this.orders = new LinkedList<>();
    }

    public void addNewOrder(String order) {
        orders.addLast(order);
    }

    public String getNextOrderForProcess() {
        return orders.poll();
    }

    public void deleteOrder(String order) {
        orders.remove(order);
    }

    public void printOrders() {
        System.out.println("Все заказы:");
        orders.forEach(System.out::println);
        System.out.println();
    }
}
