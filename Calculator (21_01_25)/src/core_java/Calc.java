package core_java;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

   
        Add add = new Add();
        Sub sub = new Sub();
        Mul mul = new Mul();
        Div div = new Div();

        int choice; 

        do {
            System.out.println("Enter the first number: ");
            int no1 = scan.nextInt();

            System.out.println("Enter the second number: ");
            int no2 = scan.nextInt();
        
            System.out.println("Enter the operation choice: ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            choice = scan.nextInt();  

            switch(choice) {
                case 1:
                    add.add(no1, no2);  
                    break;
                case 2:
                    sub.sub(no1, no2);  
                    break;
                case 3:
                    mul.mul(no1, no2);  
                    break;
                case 4:
                    div.div(no1, no2); 
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose between 1 and 5.");
            }
        
        } while(choice != 5);  // Loop continues until user enters '5' to exit

        scan.close(); // Close the scanner after use, the Scanner should only be closed once at the end of all the operations, outside the loop.
    }
}
