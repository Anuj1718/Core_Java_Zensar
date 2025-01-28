package core_java;

//Subclass: Teacher
public class Teacher extends Person {
 private String subject;

 // Constructor for Teacher
 public Teacher(String name, int id, String subject) {
     super(name, id); // Call the superclass constructor
     this.subject = subject;
 }

 // Override displayInfo to include subject
 @Override
 public void displayInfo() {
     super.displayInfo(); // Call the superclass displayInfo method
     System.out.println("Subject: " + subject);
 }
}
