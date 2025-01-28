package core_java;

public class Book1 {
    String title;
    String author;
    double price;

    // Default Constructor
    public Book1() {
        this("Unknown", "Unknown", 0.0); // Calling the constructor with three parameters
    }

    // Constructor with one parameter (title)
    public Book1(String title) {
        this(title, "Unknown", 0.0); // Calling the constructor with three parameters
    }

    // Constructor with two parameters (title, author)
    public Book1(String title, String author) {
        this(title, author, 0.0); // Calling the constructor with three parameters
    }

    // Constructor with three parameters (title, author, price)
    public Book1(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs" + price);
    }
}
