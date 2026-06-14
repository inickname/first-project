package hw_3_static_final_and_access_modifiers;

public class Main {
    public static void main(String[] args) {
        // Класс Company
        Company company1 = new Company(1, "Петя");
        Company company2 = new Company(2, "Коля");

        Company.companyName = "Google";

        company1.printCompanyName();
        company2.printCompanyName();

        // company1.EMPLOYEE_ID = 33;

        // Класс MathConstants
        MathConstants.calculateCircleArea(2);
        MathConstants.calculateCircumference(2);

        MathConstants.calculateCircleArea(3);
        MathConstants.calculateCircumference(3);

        // Класс Library

        // Класс University
        University university1 = new University(1, "Петя");
        University university2 = new University(2, "Коля");
        University university3 = new University(3, "Ваня");

        University.universityName = "МГУ";

        university1.printStudentInfo();
        university2.printStudentInfo();
        university3.printStudentInfo();

        // Класс GameSettings

    }
}
