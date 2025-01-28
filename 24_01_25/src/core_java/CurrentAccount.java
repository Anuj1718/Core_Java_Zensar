package core_java;

public class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 10000; // Overdraft limit

    public CurrentAccount(String accountNumber, double balance, String accountHolderName) {
        super(accountNumber, balance, accountHolderName);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Withdrawal failed. Overdraft limit exceeded.");
        }
    }

    @Override
    public void applyInterest() {
        System.out.println("No interest applied for current accounts.");
    }
}
