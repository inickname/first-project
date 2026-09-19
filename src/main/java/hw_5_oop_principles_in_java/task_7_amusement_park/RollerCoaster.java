package hw_5_oop_principles_in_java.task_7_amusement_park;

public class RollerCoaster extends Attraction implements Printable, Maintainable {
    @Override
    public String info() {
        return "Острые ощущения";
    }

    @Override
    public void maintain() {
        System.out.println("Проверка безопасности");
    }
}
