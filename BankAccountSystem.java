
import java.util.ArrayList;

/*
 * Main class: BankAccountSystem
 * Demonstrates polymorphism, collections and exception handling.
 */
public class BankAccountSystem {

    public static void main(String[] args) {

        // ArrayList stores multiple BankAccount objects.
        ArrayList<BankAccount> accounts = new ArrayList<>();

        // Polymorphism: BankAccount reference points to SavingsAccount objects.
        BankAccount account1 = new SavingsAccount("SB101", 10000, 5);
        BankAccount account2 = new SavingsAccount("SB102", 15000, 6);

        accounts.add(account1);
        accounts.add(account2);

        System.out.println("===== BANK ACCOUNT DETAILS =====");

        // Iterating through the ArrayList.
        for (BankAccount account : accounts) {
            account.displayDetails();
            System.out.println("-------------------------");
        }

        // Transaction operations using SavingsAccount.
        SavingsAccount savings = (SavingsAccount) account1;

        System.out.println("\n===== TRANSACTION OPERATIONS =====");

        try {
            savings.deposit(2000);
            savings.withdraw(1000);

            // Invalid withdrawal to demonstrate exception handling.
            savings.withdraw(50000);

        } catch (IllegalArgumentException e) {
            System.out.println("Transaction Error: " + e.getMessage());
        }

        // Demonstrating invalid deposit.
        try {
            savings.deposit(-500);

        } catch (IllegalArgumentException e) {
            System.out.println("Transaction Error: " + e.getMessage());
        }

        System.out.println("\n===== UPDATED ACCOUNT DETAILS =====");

        for (BankAccount account : accounts) {
            account.displayDetails();
            System.out.println("-------------------------");
        }
    }
}
