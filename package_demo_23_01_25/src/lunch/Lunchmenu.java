package lunch;

import java.util.Scanner;

public class Lunchmenu {
	String dish;
	int cost;
	
	public void accept() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the dish: ");
		dish = scan.next();
				
		System.out.println("Enter the cost: ");
		cost=scan.nextInt();
	}
	
	public void display() {
		System.out.println("The cost for dish " + dish + " is " + cost);
	}
	



	public static void main(String[] args) {
		
	

}

}