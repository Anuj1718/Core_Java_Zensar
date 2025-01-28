package core_java;
//Main class to test the student management system
public class InheritanceExample1 {
 public static void main(String[] args) {
     // Create objects of Student, Teacher, and Staff
     Student student = new Student("John Doe", 101, "Computer Science");
     Teacher teacher = new Teacher("Dr. Smith", 201, "Mathematics");
     Staff staff = new Staff("Mary Johnson", 301, "Administration");

     // Display information for each person
     System.out.println("Student Information:");
     student.displayInfo();
     System.out.println("\nTeacher Information:");
     teacher.displayInfo();
     System.out.println("\nStaff Information:");
     staff.displayInfo();
 }
}
