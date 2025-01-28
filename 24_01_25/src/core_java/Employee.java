package core_java;

//Employee.java
public class Employee {
 // Public members are accessible anywhere
 public String name;
 
 // Private members are only accessible within this class
 private int id;
 
 // Default (package-private) members are accessible within the same package
 double salary;

 // Constructor
 public Employee(String name, int id, double salary) {
     this.name = name;
     this.id = id;
     this.salary = salary;
 }

 // Public method to access private variable id
 public int getId() {
     return id;
 }
 
 // Public method to display details
 public void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("ID: " + id);
     System.out.println("Salary: " + salary);
 }
}
