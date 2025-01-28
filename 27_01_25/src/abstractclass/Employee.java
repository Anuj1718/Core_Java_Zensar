package abstractclass;

abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculatePay();

    abstract void displayDetails();
}


class SalariedEmployee extends Employee {
    private double monthlySalary;

    SalariedEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculatePay() {
    
        return monthlySalary;
    }

    @Override
    void displayDetails() {
        System.out.println("Employee id: " + id + " with name: " + name + " has salary: " + calculatePay());
    }
}


class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    HourlyEmployee(String name, int id, double hourlyRate, double hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    void displayDetails() {
        System.out.println("Employee id: " + id + " with name: " + name + " has salary: " + calculatePay());
    }
}
