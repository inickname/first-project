package hw_5_oop_principles_in_java.task_7_amusement_park;

public class Main {
    public static void main(String[] args) {
        Attraction rollerCoaster = new RollerCoaster();
        Attraction carousel = new Carousel();

        AmusementPark amusementPark = new AmusementPark();

        amusementPark.setAttraction(rollerCoaster);
        amusementPark.operateAttraction();

        amusementPark.setAttraction(carousel);
        amusementPark.operateAttraction();
    }
}
