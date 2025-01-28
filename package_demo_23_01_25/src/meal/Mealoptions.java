package meal;

import lunch.Lunchmenu;
import dinner.Dinnermenu;
import java.util.Scanner;

public class Mealoptions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Meal Menu!");
        System.out.println("Choose your meal:");
        System.out.println("1. Lunch");
        System.out.println("2. Dinner");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();

        if (choice == 1) {
            Lunchmenu lunch = new Lunchmenu();
            System.out.println("You have chosen Lunch.");
            lunch.accept();  // Input dish and cost for lunch
            lunch.display(); // Display lunch details
            
//            need class Lunchmenu as public to be able to  make an object and accept and display methods need to be public too for them to be called 
        } else if (choice == 2) {
            Dinnermenu dinner = new Dinnermenu();
            System.out.println("You have chosen Dinner.");
            dinner.accept();  // Input dish and cost for dinner
            dinner.display(); // Display dinner details
        } else {
            System.out.println("Invalid choice. Please select 1 for Lunch or 2 for Dinner.");
        }

        scan.close();
    }
}
