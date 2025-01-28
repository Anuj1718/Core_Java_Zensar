package core_java;

public class Person1 {
    private String name;
    private int id;

    public static int totalPersons;

    static {
        totalPersons = 0;
        System.out.println("Static block in Person1 executed: totalPersons initialized to " + totalPersons);
    }

    {
        totalPersons++;
        System.out.println("Instance block in Person1 executed: totalPersons incremented to " + totalPersons);
    }

    // Constructor
    public Person1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    public static void displayTotalPersons() {
        System.out.println("Total persons: " + totalPersons);
    }
}