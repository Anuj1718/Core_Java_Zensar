package core_java;

//Subclass: Student
public class Student extends Person {
 private String course;

 // Constructor for Student
 public Student(String name, int id, String course) {
     super(name, id); // Call the superclass constructor
     this.course = course;
 }

 // Override displayInfo to include course
 @Override
 public void displayInfo() {
     super.displayInfo(); // Call the superclass displayInfo method
     System.out.println("Course: " + course);
 }
}
