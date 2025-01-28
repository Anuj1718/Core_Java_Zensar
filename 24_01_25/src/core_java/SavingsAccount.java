package core_java;

public class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.03; // 3% interest rate

    public SavingsAccount(String accountNumber, double balance, String accountHolderName) {
        super(accountNumber, balance, accountHolderName);
    }

    @Override
    public void applyInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest applied. New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal failed. Check balance or amount.");
        }
    }
}
