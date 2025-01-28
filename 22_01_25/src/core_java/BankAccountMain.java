package core_java;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

   
        BankAccount account = new BankAccount("Una", 1000.0);
        
        System.out.println("Initial Account Details:");
        account.displayDetails();
        System.out.println();


        System.out.print("Enter amount to deposit: Rs");
        double depositAmount = scan.nextDouble();
        account.deposit(depositAmount);
        account.displayBalance();
        System.out.println();


        System.out.print("Enter amount to withdraw: Rs");
        double withdrawAmount = scan.nextDouble();
        account.withdraw(withdrawAmount);
        account.displayBalance();
        System.out.println();


        System.out.println("Final Account Details:");
        account.displayDetails();

        scan.close();
    }
}