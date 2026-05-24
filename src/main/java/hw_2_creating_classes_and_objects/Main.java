package hw_2_creating_classes_and_objects;

public class Main {
    public static void main(String[] args) {
        // Класс Car
        Car supercar = new Car("Lexus", 2010);

        supercar.setYear(2012);
        supercar.print();
    }
}
