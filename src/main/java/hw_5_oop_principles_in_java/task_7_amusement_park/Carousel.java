package hw_5_oop_principles_in_java.task_7_amusement_park;

public class Carousel extends Attraction implements Printable, Maintainable {
    @Override
    public String info() {
        return "Спокойный аттракцион";
    }

    @Override
    public void maintain() {
        System.out.println("Тех. обслуживание");
    }
}
