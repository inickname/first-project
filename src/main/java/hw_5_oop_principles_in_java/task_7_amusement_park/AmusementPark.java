package hw_5_oop_principles_in_java.task_7_amusement_park;

public class AmusementPark {
    private Attraction attraction;

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public void operateAttraction() {

        if (this.attraction instanceof Printable) {
            Printable printableAttraction = (Printable) this.attraction;
            System.out.println(printableAttraction.info());
        }

        if (this.attraction instanceof Maintainable) {
            Maintainable maintainableAttraction = (Maintainable) this.attraction;
            maintainableAttraction.maintain();
        }
    }
}
