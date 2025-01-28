package core_java;

public class Student1 extends Person1 {
    private String course;

    public static int totalStudents;

    static {
        totalStudents = 0;
        System.out.println("Static block in Student1 executed: totalStudents initialized to " + totalStudents);
    }

    {
        totalStudents++;
        System.out.println("Instance block in Student1 executed: totalStudents incremented to " + totalStudents);
    }

    // Constructor for Student1
    public Student1(String name, int id, String course) {
        super(name, id); // Call the superclass constructor
        this.course = course;
    }

    // Override displayInfo to include course
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass displayInfo method
        System.out.println("Course: " + course);
    }

    public static void displayTotalStudents() {
        System.out.println("Total students: " + totalStudents);
    }
}
