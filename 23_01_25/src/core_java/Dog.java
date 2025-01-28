package core_java;

//Subclass: Dog
public class Dog extends Animal {

 // Constructor for Dog
 public Dog(String name) {
     super(name); // Call the superclass constructor, checks the immediate super class
 }

 // Overriding the makeSound method, signature is same
 @Override
 public void makeSound() {
     super.makeSound(); // Call the superclass makeSound method
     System.out.println(name + " barks: Woof! Woof!");
 }
}

//Overloading and Overriding are the practical implementations of polymorphism