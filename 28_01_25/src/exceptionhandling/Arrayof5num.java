package exceptionhandling;

import java.util.Scanner;

public class Arrayof5num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The numbers you entered are:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\n\nTraversing the array up to the 6th element:");

        try {
            for (int i = 0; i <= 5; i++) { // Intentionally accessing index 5
                System.out.println("Element at index " + i + ": " + numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an index outside the array bounds.");
        }

        scanner.close();
    }
}
