package hw_3_static_final_and_access_modifiers;

public class Main {
    public static void main(String[] args) {
        // Класс Company
        Company company1 = new Company(1, "Петя");
        Company company2 = new Company(2, "Коля");

        Company.companyName = "Google";

        company1.printCompanyName();
        company2.printCompanyName();

        // company1.employeeID = 33;

        // Класс MathConstants

    }
}
