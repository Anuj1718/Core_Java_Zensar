package core_java;

import java.util.Scanner;

public class EvenOddSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Enter a number: ");
            int number = scan.nextInt();

            // Check if the number is even or odd
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }

            // Ask if the user wants to continue
            System.out.println("Do you want to continue? Enter 1 for Yes, 2 for No:");
            choice = scan.nextInt();

            // Switch case to handle the user's decision
            switch (choice) {
                case 1:
                    System.out.println("Continuing...");
                    break;
                case 2:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1 to continue or 2 to exit.");
                    break;
            }
        } while (choice != 2);  // Continue until the user enters 2 to exit

        scan.close();  // Close the scanner
    }
}
