package dboperations;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet; OR
import java.sql.*;
import java.util.Scanner;

public class User {

    public static void main(String[] args) throws Exception {
         
        Scanner scanner = new Scanner(System.in);
        Connection con = null;  // Connection is a class 
        PreparedStatement ps = null;
   
        // Load the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Establish connection with the database
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eduverse", "root", "@Bdevilliers1718");
//        first field is url (db name is eduverse), user is root, pass is @Bdevilliers1718
        
        // Display menu to the user
        int choice;
        do {
            System.out.println("Select an operation:");
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Select");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1: // Insert
                    System.out.println("Insert Operation:");
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    String password = scanner.nextLine();
                    System.out.print("Enter User Type (STUDENT/INSTRUCTOR): "); 
                    String userType = scanner.nextLine();

                    ps = con.prepareStatement("INSERT INTO User (name, email, password, user_type) VALUES (?, ?, ?, ?)");
                    ps.setString(1, name);
                    ps.setString(2, email);
                    ps.setString(3, password);
                    ps.setString(4, userType);

                    int insertCount = ps.executeUpdate();
                    if (insertCount > 0) {
                        System.out.println("Record inserted successfully.");
                    } else {
                        System.out.println("Failed to insert record.");
                    }
                    break;

                case 2: // Update Password
                    System.out.println("Update Password Operation:");
                    System.out.print("Enter Email of the user to update: ");
                    String updateEmail = scanner.nextLine();
                    System.out.print("Enter new Password: ");
                    String newPassword = scanner.nextLine();

                    ps = con.prepareStatement("UPDATE User SET password = ? WHERE email = ?");
                    ps.setString(1, newPassword);
                    ps.setString(2, updateEmail);

                    int updateCount = ps.executeUpdate();
                    if (updateCount > 0) {
                        System.out.println("Password updated successfully.");
                    } else {
                        System.out.println("Failed to update password.");
                    }
                    break;
                    
                case 3: // Delete
                    System.out.println("Delete Operation:");
                    System.out.print("Enter Email of the user to delete: ");
                    String deleteEmail = scanner.nextLine();

                    ps = con.prepareStatement("DELETE FROM User WHERE email = ?");
                    ps.setString(1, deleteEmail);

                    int deleteCount = ps.executeUpdate();
                    if (deleteCount > 0) {
                        System.out.println("Record deleted successfully.");
                    } else {
                        System.out.println("Failed to delete record.");
                    }
                    break;

                case 4: // Select
                    System.out.println("Select Operation: Displaying all records:");
                    ps = con.prepareStatement("SELECT * FROM User");
                    ResultSet rs = ps.executeQuery();

                    while (rs.next()) {
                        System.out.println("User ID: " + rs.getInt("user_id"));
                        System.out.println("Name: " + rs.getString("name"));
                        System.out.println("Email: " + rs.getString("email"));
                        System.out.println("Password: " + rs.getString("password"));
                        System.out.println("User Type: " + rs.getString("user_type"));
                        System.out.println("--------------------------------------");
                    }
                    break;

                case 5: // Exit
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        // Close the connection
        if (con != null) {
            con.close();
        }
        scanner.close();
    }
} 
