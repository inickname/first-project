package hw_2_creating_classes_and_objects;

public class BankAccount {
    String owner;
    double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    String getOwner() {
        return this.owner;
    }

    double getBalance() {
        return this.balance;
    }

    void setOwner(String owner) {
        this.owner = owner;
    }

    double deposit(double amount) {
        return this.balance += amount;
    }

    double withdraw(double amount) {
        return this.balance -= amount;
    }

    void printBalance(double balance) {
        System.out.println("Текущий баланс: " + balance);
    }
}
