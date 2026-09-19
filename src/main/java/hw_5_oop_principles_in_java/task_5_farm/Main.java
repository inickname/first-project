package hw_5_oop_principles_in_java.task_5_farm;

public class Main {
    public static void main(String[] args) {
        FarmAnimal cow = new Cow();
        FarmAnimal chicken = new Chicken();

        Farm farm = new Farm();

        farm.setAnimal(cow);
        farm.serviceAnimal();

        farm.setAnimal(chicken);
        farm.serviceAnimal();
    }
}
