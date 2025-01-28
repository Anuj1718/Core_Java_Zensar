package core_java_ass;

//Order.java
public class Order {
 // Private attributes
 private Product product;
 private Customer customer;
 
 // Protected attribute
 protected String orderStatus;
 
 // Package-private attribute
 String orderDate;

 // Constructor
 public Order(Product product, Customer customer, String orderDate) {
     this.product = product;
     this.customer = customer;
     this.orderDate = orderDate;
     this.orderStatus = "Placed"; // Default status when the order is created
 }

 // Method to update order status
 public void updateOrderStatus(String status) {
     this.orderStatus = status;
 }

 // Method to display order details
 public void displayOrderDetails() {
     System.out.println("Order Details:");
     System.out.println("Customer: " + customer.getCustomerName());
     System.out.println("Product: " + product.getProductName());
     System.out.println("Order Status: " + orderStatus);
     System.out.println("Order Date: " + orderDate);
 }
}
