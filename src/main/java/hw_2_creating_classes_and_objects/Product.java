package hw_2_creating_classes_and_objects;

public class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    double applyDiscount(int discount) {
        return this.price - (discount * this.price / 100);
    }

    void printInfo(double newPrice) {
        System.out.println("Товар: " + this.name + ", цена: " + newPrice);
    }
}
