package core_java;

//Base class Employee
public class Employee {
 private int id;
 private double salary;

 // Constructor
 public Employee(int id, double salary) {
     this.id = id;
     this.salary = salary;
 }

 // Getter and Setter methods for id and salary
 public int getId() {
     return id;
 }

 public void setId(int id) {
     this.id = id;
 }

 public double getSalary() {
     return salary;
 }

 public void setSalary(double salary) {
     this.salary = salary;
 }

 // Method to display employee information
 public void displayInfo() {
     System.out.println("Employee ID: " + id);
     System.out.println("Employee Salary: " + salary);
 }
}
