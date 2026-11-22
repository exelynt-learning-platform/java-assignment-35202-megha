
/*
 * Demonstration of Encapsulation in Java
 */

// BankAccount class
class BankAccount {

    // Private fields - cannot be accessed directly outside the class
    private String accountNumber;
    private double balance;

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance with validation
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }
}

// Main class
public class EncapsulationDemo {

    public static void main(String[] args) {

        // Creating BankAccount object
        BankAccount account = new BankAccount();

        // Updating fields using setter methods
        account.setAccountNumber("123456789");
        account.setBalance(5000);

        // Displaying fields using getter methods
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());

        // Testing negative balance validation
        account.setBalance(-1000);

        System.out.println("Updated Balance: " + account.getBalance());
    }
}
