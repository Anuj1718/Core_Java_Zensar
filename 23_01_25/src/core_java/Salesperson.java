package core_java;

//Salesperson class inheriting from Employee
public class Salesperson extends Employee {
 private int targetSales;

 // Constructor
 public Salesperson(int id, double salary, int targetSales) {
     super(id, salary); // Calling the parent class constructor
     this.targetSales = targetSales;
 }

 // Getter and Setter methods for targetSales
 public int getTargetSales() {
     return targetSales;
 }

 public void setTargetSales(int targetSales) {
     this.targetSales = targetSales;
 }

 // Overriding the displayInfo method to include sales targets
 @Override
 public void displayInfo() {
     super.displayInfo(); // Calling the parent class displayInfo method
     System.out.println("Sales Target: " + targetSales);
 }

 // Salesperson-specific method
 public void achieveTarget() {
     System.out.println("Achieving the sales target of " + targetSales + " sales.");
 }
}


//
//By using getter and setter methods:
//
//You ensure that fields are encapsulated, so direct access to them is prevented.
//You can modify the internal data validation or processing logic later without affecting the external code that uses these methods.