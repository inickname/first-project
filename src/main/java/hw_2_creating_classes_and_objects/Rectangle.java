package hw_2_creating_classes_and_objects;

public class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getWidth() {
        return this.width;
    }

    int getHeight() {
        return this.height;
    }

    void setWidth(int width) {
        this.width = width;
    }

    int calculateArea(int width, int height) {
        return width * height;
    }
}
