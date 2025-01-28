package core_java;

import java.util.Scanner;

public class Book1Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Using Default Constructor
        Book1 defaultBook = new Book1();
        System.out.println("Default Book Details:");
        defaultBook.display();
        System.out.println();

        // Using Constructor with one parameter (title)
        Book1 singleParamBook = new Book1("1984");
        System.out.println("Book with one parameter (title):");
        singleParamBook.display();
        System.out.println();

        // Using Constructor with two parameters (title, author)
        Book1 twoParamBook = new Book1("To Kill a Mockingbird", "Harper Lee");
        System.out.println("Book with two parameters (title, author):");
        twoParamBook.display();
        System.out.println();

        // Using Constructor with three parameters (title, author, price)
        Book1 threeParamBook = new Book1("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        System.out.println("Book with three parameters (title, author, price):");
        threeParamBook.display();
        System.out.println();

        System.out.println("Enter book details:");

        System.out.print("Title: ");
        String userTitle = scan.nextLine();

        System.out.print("Author: ");
        String userAuthor = scan.nextLine();

        System.out.print("Price: ");
        double userPrice = scan.nextDouble();

        Book1 userBook = new Book1(userTitle, userAuthor, userPrice);
        System.out.println("\nUser-Entered Book Details:");
        userBook.display();

        scan.close();
    }
}


