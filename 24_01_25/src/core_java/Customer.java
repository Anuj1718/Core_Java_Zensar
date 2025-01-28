package core_java;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private List<BankAccount> accounts;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.accounts = new ArrayList<>();
    }

    public void createSavingsAccount(String accountNumber, double initialBalance) {
        BankAccount account = new SavingsAccount(accountNumber, initialBalance, name);
        accounts.add(account);
        System.out.println("Savings account created successfully.");
    }

    public void createCurrentAccount(String accountNumber, double initialBalance) {
        BankAccount account = new CurrentAccount(accountNumber, initialBalance, name);
        accounts.add(account);
        System.out.println("Current account created successfully.");
    }

    public void displayCustomerAccounts() {
        System.out.println("Customer: " + name + " (" + email + ")");
        for (BankAccount account : accounts) {
            account.displayAccountDetails();
            System.out.println();
        }
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }
}
