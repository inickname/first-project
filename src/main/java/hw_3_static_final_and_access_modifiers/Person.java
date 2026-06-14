package hw_3_static_final_and_access_modifiers;

public class Person {
    private String firstName;
    private String lastName;
    private final String SSN;

    Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = ssn;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getSSN() {
        return SSN;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void printPersonInfo() {
        System.out.printf("Имя: %s, Фамилия: %s, SSN: %s%n", firstName, lastName, SSN);
    }
}
