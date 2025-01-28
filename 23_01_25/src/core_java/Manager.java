package core_java;
//Manager class inheriting from Employee
public class Manager extends Employee {
 private String department;

 // Constructor
 public Manager(int id, double salary, String department) {
     super(id, salary); // Calling the parent class constructor
     this.department = department;
 }

 // Getter and Setter methods for department
 public String getDepartment() {
     return department;
 }

 public void setDepartment(String department) {
     this.department = department;
 }

 // Overriding the displayInfo method to include department
 @Override
 public void displayInfo() {
     super.displayInfo(); // Calling the parent class displayInfo method
     System.out.println("Department: " + department);
 }

 // Manager-specific method
 public void manageTeam() {
     System.out.println("Managing the team in the " + department + " department.");
 }
}
