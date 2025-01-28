package core_java;

//Base class: Person
public class Person {
 protected String name;
 protected int id;

 // Constructor for Person
 public Person(String name, int id) {
     this.name = name;
     this.id = id;
 }

 // Method to display information
 public void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("ID: " + id);
 }
}
