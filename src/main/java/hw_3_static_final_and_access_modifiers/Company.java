package hw_3_static_final_and_access_modifiers;

public class Company {
    static String companyName = "Apple";
    final int EMPLOYEE_ID;
    String employeeName;

    Company(int employeeID, String employeeName) {
        this.EMPLOYEE_ID = employeeID;
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
