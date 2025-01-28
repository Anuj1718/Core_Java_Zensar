package abstractclass;


public class VehicleMain {
 public static void main(String[] args) {
//	 Vehicle vehicle = new Vehicle("Thrust SSC"); Cannot instantiate the type Vehicle error 
     Vehicle car = new Car("Sedan");
     Vehicle electricCar = new ElectricCar("Tesla Model 3");
     
    
     // Start engine and display fuel type for Car
     car.startEngine();
     System.out.println("Fuel Type: " + car.fuelType());

     // Start engine and display fuel type for ElectricCar
     electricCar.startEngine();
     System.out.println("Fuel Type: " + electricCar.fuelType());
 }
}
