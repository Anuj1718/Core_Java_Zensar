package core_java;

public class InheritanceExample3 {
	    public static void main(String[] args) {
	        // Create objects for different types of employees
	        Manager manager = new Manager(1, 80000.0, "HR");
	        Developer developer = new Developer(2, 60000.0, "Java");
	        Salesperson salesperson = new Salesperson(3, 50000.0, 100);

	        // Display information for each employee
	        System.out.println("Manager Information:");
	        manager.displayInfo();
	        manager.manageTeam(); // Manager-specific method

	        System.out.println("\nDeveloper Information:");
	        developer.displayInfo();
	        developer.code(); // Developer-specific method

	        System.out.println("\nSalesperson Information:");
	        salesperson.displayInfo();
	        salesperson.achieveTarget(); // Salesperson-specific method
	        
	     // Using setter methods to update attributes
	        manager.setSalary(85000.0);
	        manager.setDepartment("Finance");

	        developer.setSalary(65000.0);
	        developer.setProgrammingLanguage("Python");

	        salesperson.setSalary(55000.0);
	        salesperson.setTargetSales(120);

	        // Display updated information
	        System.out.println("\nUpdated Manager Information:");
	        manager.displayInfo();

	        System.out.println("\nUpdated Developer Information:");
	        developer.displayInfo();

	        System.out.println("\nUpdated Salesperson Information:");
	        salesperson.displayInfo();
	    }
	}
