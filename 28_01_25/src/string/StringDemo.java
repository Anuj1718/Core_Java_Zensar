package string;

import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        if (fullName.isEmpty() || fullName.trim().length() < 3) {
            System.out.println("Invalid name. Please enter a valid full name.");
            return;
        }

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();
        if (address.isEmpty()) {
            System.out.println("Address cannot be empty.");
            return;
        }

        System.out.print("Enter your 10-digit phone number: ");
        String phoneNumber = scanner.nextLine();
        if (phoneNumber.length() != 10 || !phoneNumber.chars().allMatch(Character::isDigit)) {
            System.out.println("Invalid phone number. Please enter exactly 10 digits.");
            return;
        }


        System.out.print("Enter your age: ");
        String ageInput = scanner.nextLine();
        int age;
        try {
            age = Integer.parseInt(ageInput);
            if (age <= 0 || age > 99) {
                System.out.println("Invalid age. Please enter a valid age between 1 and 99.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid age. Please enter a numeric value.");
            return;
        }
        
        System.out.print("Enter your blood group (e.g., A+, B-, O+, AB-): ");
        String bloodGroup = scanner.nextLine();
        if (!(bloodGroup.equals("A+") || bloodGroup.equals("A-") || bloodGroup.equals("B+") || 
              bloodGroup.equals("B-") || bloodGroup.equals("O+") || bloodGroup.equals("O-") || 
              bloodGroup.equals("AB+") || bloodGroup.equals("AB-"))) {
            System.out.println("Invalid blood group. Please use the correct format (e.g., A+, B-, O+).");
            return;
        }


        System.out.print("Enter your email ID: ");
        String email = scanner.nextLine();
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Invalid email ID. Please enter a valid email address.");
            return;
        }

        System.out.println("\nCollected Information:");
        System.out.println("Name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Age: " + age);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Email ID: " + email);
    }
}
