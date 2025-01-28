package core_java;

//Main class
public class InheritanceExample {
 public static void main(String[] args) {
	 
	 Animal myAnimal = new Animal("Enzo");
	 myAnimal.makeSound();
	 
     // Create an instance of Dog
     Dog myDog = new Dog("Buddy");

     // Call the makeSound method
     myDog.makeSound();
 }
}
