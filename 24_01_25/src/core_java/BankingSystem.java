package core_java;

import java.util.List;

public class BankingSystem {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", "john.doe@example.com");

        // Create accounts
        customer.createSavingsAccount("SAV123", 5000);
        customer.createCurrentAccount("CUR456", 2000);

        // Display accounts
        customer.displayCustomerAccounts();

        // Perform actions on accounts
        List<BankAccount> accounts = customer.getAccounts();

        // Deposit into the savings account
        accounts.get(0).deposit(2000);

        // Apply interest to the savings account
        accounts.get(0).applyInterest();

        // Withdraw from the current account
        accounts.get(1).withdraw(2500);

        // Display updated account details
        customer.displayCustomerAccounts();
    }
}
