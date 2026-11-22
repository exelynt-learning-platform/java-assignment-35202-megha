
/*
 * Transaction interface
 * Defines methods for depositing and withdrawing money.
 */
public interface Transaction {

    void deposit(double amount);

    void withdraw(double amount);
}
