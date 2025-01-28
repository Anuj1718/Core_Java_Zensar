//
//Here's a clarification:
//
//| **Access Specifier** | **Same Class** | **Same Package** | **Other Package (subclass)** | **Other Package (non-subclass)** |
//|----------------------|----------------|------------------|------------------------------|----------------------------------|
//| **`public`**          | Yes            | Yes              | Yes                          | Yes                              |
//| **`protected`**       | Yes            | Yes              | Yes                          | No                               |
//| **default (no specifier)** | Yes        | Yes              | No                           | No                               |
//| **`private`**         | Yes            | No               | No                           | No                               |
//
//- **`Other Package (subclass)`** refers to whether a subclass in a different package can access the members.
//   - For **`protected`**, the subclass in a different package **can access** members marked as `protected`.
//   - For **`default`** (no modifier), the subclass **cannot access** members if it is in a different package.
//
//
//Top-level classes: Can only be public or package-private (default).
//Nested classes: Can use public, protected, private, or package-private (default) as access specifiers.

package core_java;

//AccessSpecifier_Demo.java
public class AccessSpecifier_Demo {
 public static void main(String[] args) {
     // Create an Employee object
     Employee emp = new Employee("John Doe", 101, 50000);
     
     // Display employee details using public method
     System.out.println("Employee Details:");
     emp.displayDetails();
     
     // Create a Manager object
     Manager mgr = new Manager("Jane Smith", 102, 75000, "HR");
     
     // Display manager details using overridden method
     System.out.println("\nManager Details:");
     mgr.displayDetails();
     
     // Access public name directly
     System.out.println("\nAccessing public name: " + mgr.name);
     
  // Access package-private salary (accessible within the same package)
     mgr.changeSalary(80000);
     
     // Access private id using the public getter
     System.out.println("\nManager's ID: " + mgr.getId());
     
     // Trying to access the private member id directly would give an error
     // System.out.println(emp.id); // Error: id has private access in Employee
 }
}
