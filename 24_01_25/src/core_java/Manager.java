package core_java;

//Manager.java
public class Manager extends Employee {
 // Manager class specific member
 private String department;
 
 // Constructor
 public Manager(String name, int id, double salary, String department) {
     super(name, id, salary);  // Calling the constructor of the parent class (Employee)
     this.department = department;
 }
// The id field is private, but it is accessible within the Employee class (including its constructors).
// The Manager class can access id through the constructor of Employee by calling super(name, id, salary), which passes id to the parent class, but the Manager class cannot access id directly after that.
// If you want to access the id from the Manager class, you would need to use a public method like getId() from the Employee class.

 // Public method to display details, including the manager's department
 @Override
 public void displayDetails() {
     super.displayDetails(); // Call to the parent class method
     System.out.println("Department: " + department);
 }
 
//Public method to change the salary. Salary is package-private and inherited.
public void changeSalary(double newSalary) {
  salary = newSalary;  // Can access salary as it's package-private and inherited
}

}
