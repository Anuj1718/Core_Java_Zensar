package exceptionhandling;

public class CheckAge {
    
    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access Denied: Age is less than 18.");
        } else {
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) {
  
        checkAge(20);
        checkAge(9);
    }
}
