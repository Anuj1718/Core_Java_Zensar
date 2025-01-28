package inteface;

import java.util.Scanner;

public class CollegeMain {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which course do you want to take admission for? (Engineering / Diploma / MBA)");
        String courseChoice = scanner.nextLine();
        
        College course = null;
        
        if (courseChoice.equalsIgnoreCase("Engineering")) {
            course = new Engineering();
        } else if (courseChoice.equalsIgnoreCase("Diploma")) {
            course = new Diploma();
        } else if (courseChoice.equalsIgnoreCase("MBA")) {
            course = new MBA();
        } else {
            System.out.println("Invalid choice. Please enter either Engineering, Diploma, or MBA.");
            return; 
        }
        
   
        System.out.println("\nCourse Details:");
        course.durationOfBoards();
        course.placement();
        course.culturalActivities();
        
        scanner.close();
    }
}
