
/*
 * SavingsAccount inherits BankAccount.
 * It also implements the Transaction interface.
 */
public class SavingsAccount extends BankAccount implements Transaction {

    private double interestRate;

    // Constructor uses super to call the parent constructor.
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Getter and setter for interest rate
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative.");
        }
        this.interestRate = interestRate;
    }

    // Method overriding: implements the abstract parent method.
    @Override
    public double calculateInterest() {
        return super.getBalance() * interestRate / 100;
    }

    // Implements deposit operation.
    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }

        setBalance(getBalance() + amount);
        System.out.println("Deposited: " + amount);
    }

    // Implements withdrawal operation.
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }

        if (amount > getBalance()) {
            throw new IllegalArgumentException("Insufficient balance.");
        }

        setBalance(getBalance() - amount);
        System.out.println("Withdrawn: " + amount);
    }

    // Display savings account details.
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Calculated Interest: " + calculateInterest());
    }
}
