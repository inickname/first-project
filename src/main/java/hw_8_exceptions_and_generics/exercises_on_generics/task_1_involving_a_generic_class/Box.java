package hw_8_exceptions_and_generics.exercises_on_generics.task_1_involving_a_generic_class;

public class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
