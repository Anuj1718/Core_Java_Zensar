package core_java;
//Subclass: Staff
public class Staff extends Person {
 private String department;

 // Constructor for Staff
 public Staff(String name, int id, String department) {
     super(name, id); // Call the superclass constructor
     this.department = department;
 }

 // Override displayInfo to include department
 @Override
 public void displayInfo() {
     super.displayInfo(); // Call the superclass displayInfo method
     System.out.println("Department: " + department);
 }
}
