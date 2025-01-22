package core_java;
//
//import java.util.Scanner;
//
//public class MaxofTwoNum {
//	int no1, no2;
//	
//	void Maxoftwo() {
//		no1 = 20;
//		no2 = 30;
//		
//		if(no1 > no2) {
//			System.out.println(no1 + " is greater");
//		}
//		else {
//			System.out.println(no2 + " is greater");
//		}
//	}
//	public static void main(String[] args) {
//		
//		MaxofTwoNum ob1 = new MaxofTwoNum();
//		ob1.Maxoftwo();
//	
//
//	}
//
//}


import java.util.Scanner;

public class MaxofTwoNum {
	
	void Maxoftwo(int a, int b) {
	
		if(a > b) {
			System.out.println(a + " is greater");
		}
		else {
			System.out.println(b + " is greater");
		}
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		
		int a = scan.nextInt();	
	
		System.out.println("Enter the second number: ");
	
		int b = scan.nextInt();	
		
		MaxofTwoNum ob1 = new MaxofTwoNum();
		ob1.Maxoftwo(a,b);
	

	}

}