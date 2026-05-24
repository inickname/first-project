package hw_2_creating_classes_and_objects;

public class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return this.x;
    }

    double getY() {
        return this.y;
    }

    void setX(double x) {
        this.x = x;
    }

    void print(double x, double y) {
        System.out.println("Координата x: " + this.x + ", координата y: " + this.y);
    }
}
