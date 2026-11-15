package hw_8_exceptions_and_generics.exercises_on_generics.task_3_involving_a_generic_with_two_data_types;

public class Pair<T, U> {
    T first;
    U second;

    public void setFirst(T item) {
        this.first = item;
    }

    public T getFirst() {
        return this.first;
    }

    public void setSecond(U item) {
        this.second = item;
    }

    public U getSecond() {
        return this.second;
    }
}
