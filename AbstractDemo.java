abstract class BankAccount {

    double balance = 10000;

    abstract void calculateInterest();
}

class SavingsAccount extends BankAccount {

    @Override
    void calculateInterest() {

        double interest = balance * 0.05;

        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + interest);
    }
}

public class AbstractDemo {

    public static void main(String[] args) {

        BankAccount account = new SavingsAccount();

        account.calculateInterest();
    }
}