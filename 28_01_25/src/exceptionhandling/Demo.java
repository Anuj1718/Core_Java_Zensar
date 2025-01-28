package exceptionhandling;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = scan.nextInt();
		System.out.println("Enter the value of b: ");
		int b = scan.nextInt();
		
		try {
		int ans = a/b;
		System.out.println("The division of the two numbers is: " + ans);
	}
		catch (Exception e) {
			System.out.println("Error message: " + e.getMessage());
		}
		finally {
		System.out.println("Thank you");
}
}
}

//finally is not mandatory/
//try should be there either with catch or finally, but usually we use catch.
