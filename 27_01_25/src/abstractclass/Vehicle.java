//Data abstraction is the process of hiding certain details and showing only essential information to the user.
//Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).
//
//The abstract keyword is a non-access modifier, used for classes and methods:
//
//Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
//
//Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
//An abstract class can have both abstract and regular methods
//
//
//Abstract Class:
//An abstract class is a class that is declared with the abstract keyword. It cannot be instantiated directly, but it can be subclassed. It may contain:
//
//Abstract methods: Methods declared without a body (no implementation).
//Concrete methods: Methods with a body (implemented).
//Fields, constructors, and static methods.
//
//Abstract Method:
//An abstract method is a method that is declared in an abstract class without a body. Subclasses must override and provide an implementation for all abstract methods, unless the subclass is also abstract.
//
//Key Points About Abstract Classes and Methods:
//	
//Cannot instantiate: You cannot create objects of an abstract class directly.
//
//Inheritance requirement: A subclass of an abstract class must:
//
//Provide implementations for all its abstract methods.
//Be declared abstract itself if it does not implement all abstract methods.
//Constructors: Abstract classes can have constructors that are used when subclasses are instantiated.
//
//Partial implementation: An abstract class allows partial implementation, meaning some methods can be fully implemented while others are abstract.
//
//Interfaces vs. Abstract Classes:
//
//Abstract classes can have fields and constructors, while interfaces cannot (prior to Java 8).
//A class can inherit only one abstract class but implement multiple interfaces.


package abstractclass;

abstract class Vehicle {
 String name;

 // Constructor to set the name of the vehicle
 Vehicle(String name) {
     this.name = name;
 }

 // Abstract method to specify the fuel type
 abstract String fuelType();

 // Concrete method to start the engine
 void startEngine() {
     System.out.println(name + " engine is starting...");
 }
}

//Class Car extends Vehicle
class Car extends Vehicle {
 Car(String name) {
     super(name);
 }

 @Override
 String fuelType() {
     return "Petrol/Diesel";
 }
}

//Class ElectricCar extends Vehicle
class ElectricCar extends Vehicle {
 ElectricCar(String name) {
     super(name);
 }

 @Override
 String fuelType() {
     return "Electricity";
 }
}

