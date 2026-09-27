package hw_5_oop_principles_in_java.task_8_museum;

public class Main {
    public static void main(String[] args) {
        Exhibit manuscript = new Manuscript();
        Exhibit sculpture = new Sculpture();

        Museum museum = new Museum();

        museum.setExhibit(manuscript);
        museum.showExhibit();

        museum.setExhibit(sculpture);
        museum.showExhibit();
    }
}
