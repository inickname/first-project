package hw_3_static_final_and_access_modifiers;

public class University {
    static String universityName = "МФТИ";
    final int studentID;
    String studentName;

    University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newName) {
        University.universityName = newName;
    }

    String getStudentName() {
        return studentName;
    }

    void printStudentInfo() {
        System.out.println("Имя: " + studentName + ", ID: " + studentID + ", университет: " + universityName);
    }
}
