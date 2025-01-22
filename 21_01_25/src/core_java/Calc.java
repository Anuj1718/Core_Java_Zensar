package core_java;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		can write anything instead of scan 
		
		System.out.println("Enter the first number: ");
		
		int a = scan.nextInt();	
	
		
		System.out.println("Enter the second number: ");
	
		int b = scan.nextInt();	
	
		System.out.println("The numbers are: " + a + " and " + b);
}

}