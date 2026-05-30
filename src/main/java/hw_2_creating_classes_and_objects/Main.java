package hw_2_creating_classes_and_objects;

public class Main {
    public static void main(String[] args) {
        // Класс Car
        Car supercar = new Car("Lexus", 2010);

        supercar.setYear(2012);
        supercar.print();

        // Класс Rectangle
        Rectangle rectangle1 = new Rectangle(2, 6);

        rectangle1.setWidth(3);

        int width1 = rectangle1.getWidth();
        int height1 = rectangle1.getHeight();
        int calculateArea1 = rectangle1.calculateArea(width1, height1);
        System.out.println("Площадь прямоугольника: " + calculateArea1);

        // Класс Book
        Book book1 = new Book("Три товарища", "Ремарк");

        book1.setAuthor("Эрих Мария Ремарк");

        book1.printInfo();

        // Класс BankAccount
        BankAccount bankAccount1 = new BankAccount("Petya", 1000.0);

        bankAccount1.deposit(9999.9);
        bankAccount1.withdraw(1000.0);

        bankAccount1.printBalance();

        // Класс Point
        Point point1 = new Point(37.334605, -122.009102);

        point1.setX(37.334606);

        point1.print();

        // Класс StudentGroup
        StudentGroup studentGroup1 = new StudentGroup("A", 12);

        studentGroup1.setStudentCount(15);

        studentGroup1.printInfo();

        // Класс Circle
        Circle circle1 = new Circle(2.0);

        circle1.setRadius(3.1);

        double radius1 = circle1.getRadius();

        double calculateArea2 = circle1.calculateArea(radius1);
        double calculateCircumference1 = circle1.calculateCircumference(radius1);
        System.out.println("Площадь окружности: " + calculateArea2 + ", длина окружности: " + calculateCircumference1);

        // Класс Teacher
        Teacher teacher1 = new Teacher("John Smith", "Algebra");

        teacher1.setSubject("Mathematics");
        teacher1.printInfo();

        // Класс Product
        Product product1 = new Product("Яблоки", 1000.0);

        product1.setPrice(100.0);

        double newPrice = product1.applyDiscount(25);
        product1.printInfo(newPrice);

        // Класс Laptop
        Laptop laptop1 = new Laptop("Apple", 260099.99);

        laptop1.setPrice(160099.99);

        laptop1.printInfo();
    }
}
