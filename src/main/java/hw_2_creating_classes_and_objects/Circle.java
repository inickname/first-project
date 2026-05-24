package hw_2_creating_classes_and_objects;

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double calculateArea(double radius) {
        return radius * radius * Math.PI;
    }

    double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
