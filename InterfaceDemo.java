
/*
 * Demonstration of Interfaces and Multiple Inheritance
 */

// First interface
interface Transaction {
    void deposit();
    void withdraw();
}

// Second interface
interface Interestable {
    void calculateInterest();
}

// SavingsAccount implements two interfaces.
// Java supports multiple inheritance through interfaces.
class SavingsAccount implements Transaction, Interestable {

    // Implementing Transaction interface methods
    @Override
    public void deposit() {
        System.out.println("Amount deposited successfully.");
    }

    @Override
    public void withdraw() {
        System.out.println("Amount withdrawn successfully.");
    }

    // Implementing Interestable interface method
    @Override
    public void calculateInterest() {
        System.out.println("Interest calculated successfully.");
    }
}

// Main class
public class InterfaceDemo {
    public static void main(String[] args) {

        // Creating SavingsAccount object
        SavingsAccount account = new SavingsAccount();

        // Calling all interface methods
        account.deposit();
        account.withdraw();
        account.calculateInterest();
    }
}
