package core_java_ass;

//Main.java
public class Main {
 public static void main(String[] args) {
     // Create instances of Product, Customer, Order, and Payment
     Product product = new Product("P001", "Laptop", 50000.0, 10);
     Customer customer = new Customer("C001", "John Doe", "john.doe@example.com", "123 Main St, City");
     Order order = new Order(product, customer, "2025-01-24");
     Payment payment = new Payment("PAY001", 50000.0);

     // Demonstrate the use of access specifiers:
     
     // Access public attributes (Email)
     System.out.println("Customer Email: " + customer.email);
     
     // Access private attributes via getter and setter methods
     System.out.println("Product ID: " + product.getProductId());
     System.out.println("Customer ID: " + customer.getCustomerId());

     // Access protected attributes within subclasses (not demonstrated here, as no subclass exists)

     // Access default (package-private) attributes within the same package
     System.out.println("Order Date: " + order.orderDate);
     
     // Update stock quantity (using default method)
     product.updateStockQuantity(5);
     System.out.println("Updated Stock Quantity: " + product.getStockQuantity());

     // Display order details
     order.displayOrderDetails();
     
     // Process payment and display status
     payment.processPayment();
     System.out.println("Payment Status: " + payment.getPaymentStatus());
 }
}
