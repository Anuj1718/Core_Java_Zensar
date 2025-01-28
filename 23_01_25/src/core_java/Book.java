package core_java;

public class Book {
	static int totalBooks;
	String title;
	String author;
	int bookId;
	
	static {
		totalBooks = 0;
		System.out.println("Static block executed: totalBooks is " + totalBooks);
		
	}
	
	{
		bookId = totalBooks + 1;
		totalBooks ++;
		System.out.println("Instance block executed: bookId assigned is " + bookId);
	}
	
	public Book(String title, String author)
	{
		this.title = title;
		this.author = author;
		System.out.println("Book title: " + title);
		System.out.println("Author: " + author);
	}
	
	
	public void displayBookDetails() {
		System.out.println("Book ID: " + bookId);
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		
	}
	
	public static void displayTotalBooks()
	{
		System.out.println("Total books in library: " + totalBooks);
	}
	
	public static void main(String[] args) {
		Book book1 = new Book("To Kill a Mockingbird", "Harper");
		book1.displayBookDetails();
		System.out.println("-----------------------");
		
		  Book book2 = new Book("1984", "George Orwell");
	        book2.displayBookDetails();
	        System.out.println("-----------------------");

	        Book book3 = new Book("Pride and Prejudice", "Jane Austen");
	        book3.displayBookDetails();
	        displayTotalBooks();
	        System.out.println("-----------------------");
		
	}
}
//
//The static block runs only once when the class is loaded, initializing totalBooks.
//The instance block runs every time a new object is created, assigning a bookId and incrementing the totalBooks.
//The constructor sets the title and author fields and prints them.
//The displayBookDetails method prints the details of the book, while displayTotalBooks prints the total count of books.