package core_java_ass;

//Customer.java
public class Customer {
 // Private attributes
 private String customerId;
 private String customerName;
 
 // Public attribute
 public String email;
 
 // Package-private attribute
 String address;

 // Constructor
 public Customer(String customerId, String customerName, String email, String address) {
     this.customerId = customerId;
     this.customerName = customerName;
     this.email = email;
     this.address = address;
 }

 // Public getter and setter methods for private attributes
 public String getCustomerId() {
     return customerId;
 }

 public void setCustomerId(String customerId) {
     this.customerId = customerId;
 }

 public String getCustomerName() {
     return customerName;
 }

 public void setCustomerName(String customerName) {
     this.customerName = customerName;
 }

 // Public method to get email
 public String getEmail() {
     return email;
 }
}
