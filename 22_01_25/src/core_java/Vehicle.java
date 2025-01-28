package core_java;
//
//public class Vehicle {
//    String vehicleMake;
//    String vehicleModel;
//    int manufactureYear;
//    double vehicleMileage;
//
//    Vehicle(){
//    	System.out.println("Default Constructor called");
//    	 this.vehicleMake = "Unknown";
//         this.vehicleModel = "Unknown";
//         this.manufactureYear = 0;
//         this.vehicleMileage = 100;
// 
//    }
//    	
//    Vehicle(String make, String model, int year, double mileage) {
//        this.vehicleMake = make;       
//        this.vehicleModel = model;
//        this.manufactureYear = year;
//        this.vehicleMileage = mileage;
//    }
//    
//    void Display() {
//    	 System.out.println("Vehicle Make: " + vehicleMake);
//         System.out.println("Vehicle Model: " + vehicleModel);
//         System.out.println("Manufacture Year: " + manufactureYear);
//         System.out.println("Vehicle Mileage: " + vehicleMileage + " km/l");
//         System.out.println();
//    }
//
//    public static void main(String[] args) {
//      
//        Vehicle v1 = new Vehicle(); 
//        Vehicle v2 = new Vehicle("Toyota", "Corolla", 2020, 15.5);
//        v1.Display();
//        v2.Display();
//        
//    }
//}
//


import java.util.Scanner;

public class Vehicle {
    String vehicleMake;
    String vehicleModel;
    int manufactureYear;
    double vehicleMileage;

    Vehicle() {
        System.out.println("Default Constructor called");
        vehicleMake = "Unknown";
        vehicleModel = "Unknown";
        manufactureYear = 0;
        vehicleMileage = 100;
    }

    Vehicle(String make, String model, int year, double mileage) {
        vehicleMake = make;
        vehicleModel = model;
        manufactureYear = year;
        vehicleMileage = mileage;
    }
//    No need to write this here
//    If you don’t use this when the names of parameters and class attributes are the same, the parameter values will shadow the class attributes. As a result, the class attributes will retain their default values (e.g., null for Strings).
//    The this keyword ensures that the constructor correctly assigns values to the class attributes when there is a name clash between parameter and attribute names. Without this, the class attributes won't get assigned properly if their names are the same as the parameters.
    void Display() {
        System.out.println("Vehicle Make: " + vehicleMake);
        System.out.println("Vehicle Model: " + vehicleModel);
        System.out.println("Manufacture Year: " + manufactureYear);
        System.out.println("Vehicle Mileage: " + vehicleMileage + " km/l");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of vehicles: ");
        int numberOfVehicles = scan.nextInt();
        scan.nextLine(); 

        Vehicle[] vehicles = new Vehicle[numberOfVehicles];

        for (int i = 0; i < numberOfVehicles; i++) {
            System.out.println("Enter details for vehicle " + (i + 1));

            System.out.print("Enter the vehicle make: ");
            String make = scan.nextLine();
            
            System.out.print("Enter the vehicle model: ");
            String model = scan.nextLine();
            
            System.out.print("Enter the manufacture year: ");
            int year = scan.nextInt();
            
            System.out.print("Enter the vehicle mileage (in km/l): ");
            double mileage = scan.nextDouble();
            scan.nextLine();  // Consume the newline character after taking numeric input

            // Create a vehicle object using the user input and store it in the array
            vehicles[i] = new Vehicle(make, model, year, mileage);
        }

        System.out.println("\nVehicle Details:");
        for (int i = 0; i < numberOfVehicles; i++) {
            System.out.println("Details of Vehicle " + (i + 1) + ":");
            vehicles[i].Display();
        }

        scan.close(); 
    }
}
