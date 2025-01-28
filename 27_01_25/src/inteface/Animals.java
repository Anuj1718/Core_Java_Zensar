package inteface;

public interface Animals {
    
    // Abstract methods in an interface
    void makeASound();
    
    void move();
}


//Differences Between Abstract Classes and Interfaces:
//	
//Feature	Abstract Class	Interface
//Method Implementation	Can have both abstract methods and concrete methods	All methods are abstract by default (except static and default)
//Constructor	Can have constructors	Cannot have constructors
//Multiple Inheritance	A class can extend only one abstract class	A class can implement multiple interfaces
//Access Modifiers	Methods can have various access modifiers (private, protected, etc.)	Methods are implicitly public
//State/Fields	Can have fields (instance variables)	Can have constants (static final variables) only
//Inheritance	A class can inherit an abstract class	A class can implement multiple interfaces
//Use Case	Used when related classes share common behavior or state	Used when you want to define a contract for classes without enforcing a common hierarchy


//The role and functionality of **interfaces** in Java significantly evolved starting with Java 8. Below is a comparison of how interfaces were used **before Java 8** and the enhancements made **after Java 8**.
//
//---
//
//### **Before Java 8**
//
//1. **Abstract Methods Only**:
// - Interfaces could only have abstract methods. 
// - All methods in an interface were implicitly `public` and `abstract`.
// - Implementing classes had to provide concrete implementations for all interface methods.
//
// ```java
// interface Animal {
//     void eat();  // Implicitly public and abstract
//     void sleep(); // Implicitly public and abstract
// }
//
// class Dog implements Animal {
//     @Override
//     public void eat() {
//         System.out.println("Dog eats.");
//     }
//
//     @Override
//     public void sleep() {
//         System.out.println("Dog sleeps.");
//     }
// }
// ```
//
//2. **No Method Implementations**:
// - Interfaces could not provide any method implementations.
// - All the behavior had to be defined in the implementing classes.
//
//3. **Constants Only**:
// - Variables in interfaces were implicitly `public`, `static`, and `final`.
// - Only constants could be declared in interfaces.
//
// ```java
// interface MathConstants {
//     double PI = 3.14159;  // Implicitly public, static, and final
// }
// ```
//
//---
//
//### **After Java 8**
//
//Java 8 introduced **default methods** and **static methods**, allowing interfaces to include methods with implementations, making them more versatile.
//
//#### **Key Changes**:
//
//1. **Default Methods**:
// - Interfaces can now have methods with a default implementation using the `default` keyword.
// - This allows new functionality to be added to an interface without breaking existing implementing classes.
// - Implementing classes can override these methods if needed.
//
// ```java
// interface Animal {
//     void eat();  // Abstract method
//
//     default void sleep() {
//         System.out.println("Animals sleep in different ways.");
//     }
// }
//
// class Dog implements Animal {
//     @Override
//     public void eat() {
//         System.out.println("Dog eats.");
//     }
//
//     // Optional override of the default method
//     @Override
//     public void sleep() {
//         System.out.println("Dog sleeps at night.");
//     }
// }
// ```
//
//---
//
//2. **Static Methods**:
// - Interfaces can now have static methods with implementations.
// - Static methods in interfaces are not inherited by implementing classes and must be accessed using the interface name.
//
// ```java
// interface MathOperations {
//     static int add(int a, int b) {
//         return a + b;
//     }
// }
//
// public class Main {
//     public static void main(String[] args) {
//         System.out.println(MathOperations.add(5, 3));  // Output: 8
//     }
// }
// ```
//
//---
//
//3. **Functional Interfaces and Lambda Expressions**:
// - Java 8 introduced functional interfaces, which are interfaces with exactly one abstract method.
// - Functional interfaces are a key part of Java's support for **lambda expressions** and the **Stream API**.
// - Example: The `Runnable` and `Comparator` interfaces are functional interfaces.
//
// ```java
// @FunctionalInterface
// interface Calculator {
//     int operate(int a, int b);
// }
//
// public class Main {
//     public static void main(String[] args) {
//         Calculator addition = (a, b) -> a + b;  // Lambda expression
//         System.out.println(addition.operate(5, 3));  // Output: 8
//     }
// }
// ```
//
//---
//
//4. **Improved Backward Compatibility**:
// - Default methods enable adding new methods to an interface without breaking the existing implementations.
// - Example: New methods like `forEach()` were added to `java.util.Collection` using default methods.
//
// ```java
// interface MyInterface {
//     default void display() {
//         System.out.println("Default implementation");
//     }
// }
// ```
//
//---
//
//### **Summary Table**
//
//| Feature/Version           | **Before Java 8**           | **After Java 8**               |
//|---------------------------|-----------------------------|---------------------------------|
//| **Abstract Methods**       | Yes                        | Yes                            |
//| **Default Methods**        | No                         | Yes                            |
//| **Static Methods**         | No                         | Yes                            |
//| **Private Methods**        | No                         | Added in Java 9                |
//| **Functional Interfaces**  | Limited Use (Runnable etc.)| Explicit Support via `@FunctionalInterface` |
//| **Lambda Expressions**     | No                         | Yes (Enables concise coding)   |
//
//---
//
//### **Key Benefits After Java 8**
//1. Interfaces are more flexible and powerful.
//2. Enhanced backward compatibility for interface evolution.
//3. Enables functional programming paradigms via lambda expressions and the Stream API.
//4. Reduced boilerplate code with default and static methods.
//
//These changes made interfaces much more versatile and aligned Java with modern programming practices.
