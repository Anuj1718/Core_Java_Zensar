package core_java;

public class Teacher1 extends Person1 {
    private String subject;

    public static int totalTeachers;

    static {
        totalTeachers = 0;
        System.out.println("Static block in Teacher1 executed: totalTeachers initialized to " + totalTeachers);
    }

    {
        totalTeachers++;
        System.out.println("Instance block in Teacher1 executed: totalTeachers incremented to " + totalTeachers);
    }

    // Constructor for Teacher1
    public Teacher1(String name, int id, String subject) {
        super(name, id); // Call the superclass constructor
        this.subject = subject;
    }

    // Override displayInfo to include subject
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass displayInfo method
        System.out.println("Subject: " + subject);
    }

    public static void displayTotalTeachers() {
        System.out.println("Total teachers: " + totalTeachers);
    }
}