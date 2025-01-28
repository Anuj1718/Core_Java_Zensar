package core_java_ass;

//Product.java
public class Product {
 // Private attributes
 private String productId;
 private String productName;
 
 // Protected attribute
 protected double price;
 
 // Package-private attribute
 int stockQuantity;

 // Constructor
 public Product(String productId, String productName, double price, int stockQuantity) {
     this.productId = productId;
     this.productName = productName;
     this.price = price;
     this.stockQuantity = stockQuantity;
 }

 // Public getter and setter methods for private attributes
 public String getProductId() {
     return productId;
 }

 public void setProductId(String productId) {
     this.productId = productId;
 }

 public String getProductName() {
     return productName;
 }

 public void setProductName(String productName) {
     this.productName = productName;
 }

 public double getPrice() {
     return price;
 }

 public void setPrice(double price) {
     this.price = price;
 }

 // Protected method to get stock quantity
 protected int getStockQuantity() {
     return stockQuantity;
 }

 // Default method to update stock quantity
 void updateStockQuantity(int quantity) {
     this.stockQuantity = quantity;
 }


}
