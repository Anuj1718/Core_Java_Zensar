package core_java;

import java.util.Scanner;

public class Operations {

    void add(int no1, int no2) {
        System.out.println("Addition of two numbers is: " + (no1 + no2));
    }

    void sub(int no1, int no2) {
        System.out.println("Subtraction of two numbers is: " + (no1 - no2));
    }

    void mul(int no1, int no2) {
        System.out.println("Multiplication of two numbers is: " + (no1 * no2));
    }

    void div(int no1, int no2) {
        if (no2 != 0) {
            System.out.println("Division of two numbers is: " + (no1 / no2));
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scan.nextInt();

        System.out.println("Enter the second number: ");
        int b = scan.nextInt();

        System.out.println("Enter the choice: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        int choice = scan.nextInt();  // User enters choice as an integer

        Operations obj = new Operations();

        // Switch statement to handle the user's choice
        switch (choice) {
            case 1:
                obj.add(a, b);
                break;
            case 2:
                obj.sub(a, b);
                break;
            case 3:
                obj.mul(a, b);
                break;
            case 4:
                obj.div(a, b);
                break;
            default:
                System.out.println("Invalid choice! Please choose between 1 and 4.");
        }
        
        scan.close();
    }
}


/*This was in a single Class having multiple functions like add,sub, mul, div. Now, do this : 
	
	
	Title: Basic Calculator Using Multiple Classes

	Objective:
	Design a basic calculator program that performs four arithmetic operations (Addition, Subtraction, Multiplication, and Division) using multiple classes in Java. The program should allow the user to input two numbers and select an arithmetic operation. The program will then perform the selected operation and display the result. */