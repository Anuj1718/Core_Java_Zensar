package core_java;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of books you want to input: ");
        int numberOfBooks = scan.nextInt();
        scan.nextLine(); 

        Book[] books = new Book[numberOfBooks];

        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");

            System.out.print("Title: ");
            String title = scan.nextLine();

            System.out.print("Author: ");
            String author = scan.nextLine();

            System.out.print("Price: ");
            double price = scan.nextDouble();
            scan.nextLine(); 

            // Create a new Book object and store it in the array
            books[i] = new Book(title, author, price);
        }

        System.out.println("\nBooks entered:");
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("Book " + (i + 1) + ":");
            books[i].display();
        }

        scan.close();
    }
}
