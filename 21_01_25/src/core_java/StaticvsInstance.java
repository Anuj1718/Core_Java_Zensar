package core_java;

class StaticvsInstance {
    static int staticVar = 0; // Static variable
    int instanceVar = 0;      // Instance variable

    static void staticMethod() {
        System.out.println("Static method called.");
    }

    void instanceMethod() {
        System.out.println("Instance method called.");
    }

    public static void main(String[] args) {
        // Access static members without creating an object
        System.out.println("Static Variable: " + staticVar);
        staticMethod(); 
//        or StaticvsInstance.staticMethod();

        // Access instance members using an object
        StaticvsInstance obj = new StaticvsInstance();
        obj.instanceVar = 5;
        obj.instanceMethod();
    }
}

//
//What Does static Mean?
//Belongs to the Class
//
//A static member is associated with the class itself rather than with instances (objects) of the class.
//It can be accessed without creating an object of the class.
//Shared by All Objects
//
//Static members are shared across all instances of the class. If one instance modifies a static variable, the change is reflected in all other instances.
//
//A static method cannot directly access instance variables or instance methods because they belong to objects, not the class.
//You must create an object to access instance members from a static context.

//Key Differences Between Static and Instance Members
//Aspect	Static	Instance
//Belongs To	Class	Object
//Access	Can be accessed without an object	Requires an object for access
//Memory	Shared across all objects	Separate for each object
//Can Access	Only other static members directly	Both static and instance members
//Example Usage	Utility methods, constants (e.g., Math.sqrt)	Object-specific behaviors or data

