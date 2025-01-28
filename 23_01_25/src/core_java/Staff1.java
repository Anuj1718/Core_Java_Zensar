package core_java;

public class Staff1 extends Person1 {
    private String department;

    public static int totalStaff;

    static {
        totalStaff = 0;
        System.out.println("Static block in Staff1 executed: totalStaff initialized to " + totalStaff);
    }

    {
        totalStaff++;
        System.out.println("Instance block in Staff1 executed: totalStaff incremented to " + totalStaff);
    }

    // Constructor for Staff1
    public Staff1(String name, int id, String department) {
        super(name, id); // Call the superclass constructor
        this.department = department;
    }

    // Override displayInfo to include department
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass displayInfo method
        System.out.println("Department: " + department);
    }

    public static void displayTotalStaff() {
        System.out.println("Total staff: " + totalStaff);
    }
}