package hw_3_static_final_and_access_modifiers;

public class Company {
    static String companyName = "Apple";
    final int employeeID;
    String employeeName;

    Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static void printCompanyName() {
        System.out.println(companyName);
    }

    String getEmployeeName() {
        return this.employeeName;
    }

    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
