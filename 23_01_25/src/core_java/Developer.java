package core_java;
//Developer class inheriting from Employee
public class Developer extends Employee {
 private String programmingLanguage;

 // Constructor
 public Developer(int id, double salary, String programmingLanguage) {
     super(id, salary); // Calling the parent class constructor
     this.programmingLanguage = programmingLanguage;
 }

 // Getter and Setter methods for programmingLanguage
 public String getProgrammingLanguage() {
     return programmingLanguage;
 }

 public void setProgrammingLanguage(String programmingLanguage) {
     this.programmingLanguage = programmingLanguage;
 }

 // Overriding the displayInfo method to include programming language
 @Override
 public void displayInfo() {
     super.displayInfo(); // Calling the parent class displayInfo method
     System.out.println("Programming Language: " + programmingLanguage);
 }

 // Developer-specific method
 public void code() {
     System.out.println("Writing code in " + programmingLanguage + ".");
 }
}
