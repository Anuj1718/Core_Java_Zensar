package core_java;

//Main class to test the student management system
public class InheritanceExample11 {
    public static void main(String[] args) {
        // Create objects of Student1, Teacher1, and Staff1
        Student1 student = new Student1("John Doe", 101, "Computer Science");
        Teacher1 teacher = new Teacher1("Dr. Smith", 201, "Mathematics");
        Staff1 staff = new Staff1("Mary Johnson", 301, "Administration");

        // Display information for each person
        System.out.println("\nStudent Information:");
        student.displayInfo();

        System.out.println("\nTeacher Information:");
        teacher.displayInfo();

        System.out.println("\nStaff Information:");
        staff.displayInfo();

        // Display total counts
        System.out.println("\nSummary:");
        Person1.displayTotalPersons();
        Student1.displayTotalStudents();
        Teacher1.displayTotalTeachers();
        Staff1.displayTotalStaff();
    }
}
