package hw_5_oop_principles_in_java.task_8_museum;

public class Museum {
    private Exhibit exhibit;

    void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public void showExhibit() {
        System.out.println(this.exhibit.describe());
        this.exhibit.preserve();
    }
}
