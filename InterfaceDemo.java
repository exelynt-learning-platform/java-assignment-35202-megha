 interface Transaction {
           void  deposit();

            void Withdraw();
        }
        interface Interestable{
            void CalculateInterest();
        }
        class SavingAccount implements Transaction,Interestable
        {
            public void deposit() {
                System.out.println("Amount deposited successfully");

            }
            public void Withdraw() {
                System.out.println("Amount withdraw successfully");

            }
            public void CalculateInterest() {
                System.out.println("Interest calculated succsessfully");
            }
        }
        public class InterfaceDemo
        {
        public static void main(String args[]) {
            SavingAccount account = new SavingAccount();
            account.deposit();
            account.Withdraw();
            account.CalculateInterest();
        }
    }
