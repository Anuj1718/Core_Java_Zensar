package core_java_ass;

//Payment.java
public class Payment {
 // Private attributes
 private String paymentId;
 
 // Protected attribute
 protected double paymentAmount;
 
 // Package-private attribute
 String paymentStatus;

 // Constructor
 public Payment(String paymentId, double paymentAmount) {
     this.paymentId = paymentId;
     this.paymentAmount = paymentAmount;
     this.paymentStatus = "Pending"; // Default status
 }

 // Public method to process payment
 public void processPayment() {
     this.paymentStatus = "Completed";
     System.out.println("Payment Processed. Status: " + paymentStatus);
 }

 // Public method to get payment status
 public String getPaymentStatus() {
     return paymentStatus;
 }
}

