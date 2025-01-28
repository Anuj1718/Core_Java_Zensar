package core_java;

public class Book {
    String title;
    String author;
    double price;

    public Book() {
        System.out.println("Default constructor called");
        title = "Unknown Title";
        author = "Unknown Author";
        price = 0.0;
    }

   
    public Book(String title, String author, double price) {
        this.title = title;  // Resolves ambiguity
        this.author = author; 
        this.price = price; 
    }

    public void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: Rs" + price);
        System.out.println();
    }
}
