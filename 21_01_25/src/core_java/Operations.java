package core_java;

public class Operations {
	int no1, no2;
//	instance variables, cannot initialize them here, gotta make constructor, or initialize inside methods or in main method
	
	void add() {
		no1 = 5;
		no2 = 10;
		
		System.out.println("Addition of two numbers is: " + (no1+no2));
		
	} 
//	wrote this outside main as cannot have function inside function
	void sub() {
		no1 = 15;
		no2 = 10;
		
		System.out.println("Subtraction of two numbers is: " + (no1-no2));
		
	} 
	
	void mul() {
		no1 = 5;
		no2 = 10;
		
		System.out.println("Multiplication of two numbers is: " + (no1*no2));
		
	} 
	
	void div() {
		no1 = 30;
		no2 = 10;
		
		System.out.println("Division of two numbers is: " + (no1/no2));
		
	} 
//	four instance methods
	
	public static void main(String[] args) {
		Operations ob1 = new Operations();
		ob1.add();
/*	 can not just write add() as it is static, gotta make object. A static method cannot directly access instance variables or instance methods because they belong to objects, not the class.
	 You must create an object to access instance members from a static context */
		ob1.sub();
		ob1.mul();
		ob1.div();
//		Methods add(), sub(), mul(), and div() are instance methods, so they require an object (ob1) to be called in the main method, which is static.
	}
	
}
